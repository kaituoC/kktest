package vip.dreamaker.kktest.service.test;

import com.alibaba.fastjson.JSON;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Optional;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.CompareOperator;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.filter.BinaryComparator;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.PrefixFilter;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * @author changkaituo
 * @date 2020-02-03
 */
public class HbaseTest {

  private static final long DAY_1 = 24 * 3600_000L;
  private static final long DAY_7 = 30 * DAY_1;
  private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HH:mm:ss");

  public static void main(String[] args) throws IOException {
//    String key = "admob_ca-app-pub-6190449355858639/2392591752";
//    String key = "facebook";
    String key = "admob";
//    String key = "gdt_6090486728688600";
    Optional<AdIdProfile> profileInner = getProfileInner(key);
    profileInner.ifPresent(x -> System.out.println("profileInner::" + JSON.toJSONString(x)));

//    testScan(key);
  }

  //连接集群
  public static Connection initHbase() throws IOException {

    Configuration configuration = HBaseConfiguration.create();
    configuration.set("hbase.zookeeper.property.clientPort", "2182");
    configuration.set("hbase.zookeeper.quorum", "10.240.2.1");
    //集群配置↓
    //configuration.set("hbase.zookeeper.quorum", "101.236.39.141,101.236.46.114,101.236.46.113");
//    configuration.set("hbase.master", "127.0.0.1:60000");
    Connection connection = ConnectionFactory.createConnection(configuration);
    return connection;
  }

//  private static void testScan(String key) throws IOException {
//    long ts = System.currentTimeMillis();
//    Connection connection = initHbase();
//    Table table = connection.getTable(TableName.valueOf("AD_INCOME_ADID"));
//    Scan scan = new Scan();
//    PrefixFilter prefixFilter = new PrefixFilter(Bytes.toBytes(key + "_"));
//    scan.setFilter(prefixFilter);
//    ResultScanner scanner = table.getScanner(scan);
//    if (scanner == null) {
//      System.out.println("scanner is null");
//      return;
//    }
//    ScanMetrics scanMetrics = scanner.getScanMetrics();
//    System.out.println("scanMetrics::" + JSON.toJSONString(scanMetrics));
//    Iterator<Result> iterator = scanner.iterator();
//    for (Result result : scanner) {
//      try {
//        if (result != null && !result.isEmpty()) {
//          byte[] row = result.getRow();
//          long dt = Long.MAX_VALUE - Bytes.toLong(row, row.length - 8);
//          long delay = (ts - dt) / DAY_1;
//          if (delay > 7) {
//            delay = 8;
//          }
//          String adpos = Bytes.toString(row, 0, row.length - 9);
//          String[] split = adpos.split("_");
//          String code = split[0].trim();
//          String adid = split[1].trim();
//          int viewb = Bytes.toInt(result.getValue("a".getBytes(), "viewb".getBytes()));
//          int clickb = Bytes.toInt(result.getValue("a".getBytes(), "clickb".getBytes()));
//          int inviewb = Bytes.toInt(result.getValue("a".getBytes(), "inviewb".getBytes()));
//          String reqkey = Bytes.toString(result.getValue("a".getBytes(), "reqkey".getBytes()));
//          float cost = 0;//Bytes.toFloat(result.getValue("a".getBytes(), "cost".getBytes()));
//          long update = -1;
//          Cell costCell = result.getColumnLatestCell("a".getBytes(), "cost".getBytes());
//          if (costCell != null) {
//            cost = Bytes.toFloat(CellUtil.cloneValue(costCell));
//            update = costCell.getTimestamp();
//          }
//          float ecpm = Bytes.toFloat(result.getValue("a".getBytes(), "cpm".getBytes()));
//          int view = Bytes.toInt(result.getValue("a".getBytes(), "inview".getBytes()));
//          int click = Bytes.toInt(result.getValue("a".getBytes(), "click".getBytes()));
//          String adname = Bytes.toString(result.getValue("a".getBytes(), "adname".getBytes()));
//          String appname = Bytes.toString(result.getValue("a".getBytes(), "appname".getBytes()));
//          AdIdProfile profile = new AdIdProfile(code, adid, 0, ecpm, inviewb, viewb, clickb, view,
//              click, cost, dt, reqkey, appname, adname, update);
//          if (inviewb < view || clickb < click) {
////              log.info("{}", profile);
//            System.out.println(JSON.toJSONString(profile));
//          }
//          if (profile.getEcpmB() < 1F) {
////              log.warn("ecpm too low:{}", profile);
//            System.out.println("ecpm too low:{}" + JSON.toJSONString(profile));
//          }
//          System.out.println("" + JSON.toJSONString(profile));
//        }
//      } catch (Exception e) {
//        e.printStackTrace();
//      }
//    }
//    System.out.println("over");
//  }


  private static Optional<AdIdProfile> getProfileInner(String key) throws IOException {
    Connection connection = initHbase();
    Table table = connection.getTable(TableName.valueOf("AD_INCOME_ADID"));
//    Table table = HBaseClient.getTable("AD_INCOME_ADID");
    long ts = System.currentTimeMillis();
    Scan scan = new Scan();
//    scan.setLimit(1);

    SingleColumnValueFilter valueFilter = new SingleColumnValueFilter(Bytes.toBytes("a"),
        Bytes.toBytes("cpm"),
        CompareOperator.GREATER, new BinaryComparator(Bytes.toBytes(0.1F)));
    valueFilter.setFilterIfMissing(true);
    SingleColumnValueFilter valueFilter1 = new SingleColumnValueFilter(Bytes.toBytes("a"),
        Bytes.toBytes("viewb"),
        CompareOperator.GREATER, new BinaryComparator(Bytes.toBytes(1)));
    valueFilter1.setFilterIfMissing(true);

    PrefixFilter prefixFilter = new PrefixFilter(Bytes.toBytes(key + "_"));
//    Filter filter = new FilterList(prefixFilter, valueFilter, valueFilter1);
    Filter filter = new FilterList(prefixFilter);
    scan.setFilter(filter);
//    try {
//      scan.setTimeRange(ts - DAY_7, ts);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    System.out.println("rowKey\tviewb\tcpm\tdate");
    try {
      ResultScanner scanner = table.getScanner(scan);
      if (scanner != null) {
        Iterator<Result> iterator = scanner.iterator();
        int total = 0;
        int effect = 0;
        while (iterator.hasNext()) {
          total++;
          Result result = iterator.next();
          byte[] row1 = result.getRow();
          long ts1 = Long.MAX_VALUE - Bytes.toLong(row1, row1.length - 8);
          String prefix = Bytes.toString(row1, 0, row1.length - 8);
          String rowKey = prefix + ts1;
          try {
            byte[] vb = result.getValue("a".getBytes(), "viewb".getBytes());
            byte[] vc = result.getValue("a".getBytes(), "cpm".getBytes());
            int viewb = -1;
            float cpm = -1.0F;
            if (vb != null) {
              viewb = Bytes.toInt(vb);
            }
            if (vc != null) {
              cpm = Bytes.toFloat(vc);
            }
            if (viewb > 1 && cpm > 0.1F) {
              effect++;
            }
            System.out
                .println(rowKey + "\t" + viewb + "\t" + cpm + "\t" + simpleDateFormat.format(ts1));

          } catch (Exception e) {
            e.printStackTrace();
          }
//        for (Result result : scanner) {
//          if (result != null && !result.isEmpty()) {
//            byte[] row = result.getRow();
//            long dt = Long.MAX_VALUE - Bytes.toLong(row, row.length - 8);
//            long delay = (ts - dt) / DAY_1;
//            if (delay > 7) {
//              delay = 8;
//            }
//            String adpos = Bytes.toString(row, 0, row.length - 9);
//            String[] split = adpos.split("_");
//            String code = split[0].trim();
//            String adid = split[1].trim();
//            int viewb = Bytes.toInt(result.getValue("a".getBytes(), "viewb".getBytes()));
//            int clickb = Bytes.toInt(result.getValue("a".getBytes(), "clickb".getBytes()));
//            int inviewb = Bytes.toInt(result.getValue("a".getBytes(), "inviewb".getBytes()));
//            String reqkey = Bytes.toString(result.getValue("a".getBytes(), "reqkey".getBytes()));
//            float cost = 0;//Bytes.toFloat(result.getValue("a".getBytes(), "cost".getBytes()));
//            long update = -1;
//            Cell costCell = result.getColumnLatestCell("a".getBytes(), "cost".getBytes());
//            if (costCell != null) {
//              cost = Bytes.toFloat(CellUtil.cloneValue(costCell));
//              update = costCell.getTimestamp();
//            }
//            float ecpm = Bytes.toFloat(result.getValue("a".getBytes(), "cpm".getBytes()));
////            int view = Bytes.toInt(result.getValue("a".getBytes(), "inview".getBytes()));
//            int view = 0;
////            int click = Bytes.toInt(result.getValue("a".getBytes(), "click".getBytes()));
//            int click = 0;
//            String adname = Bytes.toString(result.getValue("a".getBytes(), "adname".getBytes()));
//            String appname = Bytes.toString(result.getValue("a".getBytes(), "appname".getBytes()));
//            AdIdProfile profile = new AdIdProfile(code, adid, 0, ecpm, inviewb, viewb, clickb, view,
//                click, cost, dt, reqkey, appname, adname, update);
//            if (inviewb < view || clickb < click) {
//              System.out.println(JSON.toJSONString(profile));
//            }
//            if (profile.getEcpmB() < 1F) {
//              System.out.println("ecpm too low:" + JSON.toJSONString(profile));
//            }
//            System.out.println("profile::" + JSON.toJSONString(profile));
//            return Optional.ofNullable(profile);
//          }
        }
        System.out.println("total:" + total + "\teffect:" + effect + "\tover");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return Optional.empty();
  }
}
