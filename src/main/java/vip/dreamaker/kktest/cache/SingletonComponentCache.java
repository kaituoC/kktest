package vip.dreamaker.kktest.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 * @author kaituo
 * @date 2019/10/16 17:00
 */
@Component
public class SingletonComponentCache {

  private static Cache<String, String> localCache = null;

  public SingletonComponentCache() {
  }



//  private static SingletonComponentCache instance;
//  public static SingletonComponentCache getInstance() {
//    if (instance == null) {
//      synchronized (SingletonComponentCache.class) {
//        if (instance == null) {
//          instance = new SingletonComponentCache();
//        }
//      }
//    }
//    return instance;
//  }

  @PostConstruct
  private void init() {
    localCache = CacheBuilder.newBuilder()
        .maximumSize(10000)
        // 设置并发数，即同一时间最多只能有50个线程往cache执行写入操作
        .concurrencyLevel(20)
        .expireAfterWrite(10 * 60, TimeUnit.SECONDS)
        .initialCapacity(100)
        .build();
  }

  public String get(String key) {
    return localCache.getIfPresent(key);
  }

  public void put(String key, String value) {
    localCache.put(key, value);
  }

}
