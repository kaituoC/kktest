package vip.dreamaker.kktest.service.test;

import java.util.concurrent.TimeUnit;

/**
 * @author kaituo
 * @date 2019/12/10 15:08
 */
public class InnerClassTest {

  static {
    System.out.println("static code");
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static InnerClassTest instance = new InnerClassTest();

  private InnerClassTest() {
    try {
      System.out.println("constructor");
      TimeUnit.SECONDS.sleep(3);

      System.out.println("start thread");
      PkgListUpdater pkgListUpdater = new PkgListUpdater();
      pkgListUpdater.setName("WdjPkgListUpdater");
      pkgListUpdater.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static InnerClassTest getInstance() {
    return instance;
  }

  private static class PkgListUpdater extends Thread {

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName() + " running...");
      try {
        TimeUnit.SECONDS.sleep(5);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " over!!!!!!");
    }
  }
}
