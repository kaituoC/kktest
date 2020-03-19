package vip.dreamaker.kktest.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author changkaituo
 * @date 2020/3/11 15:05
 */
public class ShutdownHookTest {

  private static final CountDownLatch c = new CountDownLatch(1);

  /**
   * hook线程
   */
  static class CleanWorkThread extends Thread {

    @Override
    public void run() {
      System.out.println("clean some work.");
      for (int i = 0; i < 10; i++) {
        System.out.println("i==" + i);
        try {
          TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      c.countDown();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Runtime.getRuntime().addShutdownHook(new CleanWorkThread());
    System.out.println("main thread start....");
//    while (c.getCount() > 0) {
//      TimeUnit.SECONDS.sleep(1);
//    }
    System.out.println("main thread over!!!!");
  }

}
