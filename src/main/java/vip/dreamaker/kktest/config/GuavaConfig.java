package vip.dreamaker.kktest.config;

import com.google.common.cache.CacheBuilder;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: shenshangyu
 * @date: 2019/11/8 4:40 下午
 * @Description: 缓存配置
 */
@Configuration
public class GuavaConfig {
  @Value("${guava.expire.time}")
  private long expireAfterWrite;

  @Bean
  public CacheManager cacheManager(){
    GuavaCacheManager guavaCacheManager = new GuavaCacheManager();
    guavaCacheManager.setCacheBuilder(CacheBuilder.newBuilder().expireAfterWrite(expireAfterWrite, TimeUnit.SECONDS));
    return guavaCacheManager;
  }
}
