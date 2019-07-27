package vip.dreamaker.kktest.test;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

  public static void main(String[] args) {
    ThreadPoolExecutor fixedThreadPool = new ThreadPoolExecutor(10, 100,
        60L, TimeUnit.SECONDS,
        new ArrayBlockingQueue<Runnable>(1000),
        new ThreadFactoryBuilder().setNameFormat("loganalyze-%d").build());
    try {

      fixedThreadPool.execute(() -> {
        try {
          Thread.sleep(5000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        throw new RuntimeException("my exception");
      });
      fixedThreadPool.shutdown();
      while (!fixedThreadPool.isTerminated()) {
        int activeCount = fixedThreadPool.getActiveCount();
        System.out.println("activeCount:" + activeCount);
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
      System.out.println("fixedThreadPool.isTerminated()");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
