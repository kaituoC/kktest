package vip.dreamaker.kktest.utils;

import com.github.sps.metrics.OpenTsdbReporter;
import com.github.sps.metrics.TaggedMetricRegistry;
import com.github.sps.metrics.opentsdb.OpenTsdb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Description:
 * User: chencheng
 * Date: 2018-04-24 20:54
 */
public class TaggedMetricRegisterProvider {

  private static final String DEFAULT_OPENTSDB_ADDR = "http://172.16.41.58:4242/api/put";
//  private static final String DEFAULT_OPENTSDB_ADDR = "http://39.155.134.145:4242/api/put";
  private static Logger LOG = LoggerFactory.getLogger(TaggedMetricRegisterProvider.class);
  private TaggedMetricRegistry taggedMetricRegistry;

  private volatile static TaggedMetricRegisterProvider instance = null;

  public static TaggedMetricRegisterProvider getInstance() {
    if (instance == null) {
      synchronized (TaggedMetricRegisterProvider.class) {
        if (instance == null) {
          instance = new TaggedMetricRegisterProvider();
          instance.init(instance.getDefaultMetricsRegistry());
        }
      }
    }
    return instance;
  }

  public void init(TaggedMetricRegistry taggedMetricRegistry) {
    this.taggedMetricRegistry = taggedMetricRegistry;
  }

  public TaggedMetricRegistry getTaggedMetricRegistry() {
    return taggedMetricRegistry;
  }

  private TaggedMetricRegistry getDefaultMetricsRegistry() {
    try {
      Map<String, String> tags = new HashMap<>();
      tags.put("component", "dolphin");
      try {
        String hostName = InetAddress.getLocalHost().getHostName();
        tags.put("host", hostName);
      } catch (UnknownHostException e) {
        LOG.error("Cannot resolve local host");
      }

      OpenTsdb openTsdb = OpenTsdb.forService(DEFAULT_OPENTSDB_ADDR)
          .withGzipEnabled(true)
          .create();
      TaggedMetricRegistry metricRegistry = new TaggedMetricRegistry();
      OpenTsdbReporter.forRegistry(metricRegistry)
          .withTags(tags)
          .withBatchSize(20)
          .build(openTsdb)
          .start(10L, TimeUnit.SECONDS);
      return metricRegistry;
    } catch (Exception e) {
      LOG.error("init metrics failed!", e);
    }
    return null;
  }
}

