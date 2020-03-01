package vip.dreamaker.kktest.test;

/**
 * @author kaituo
 * @date 2019/11/19 20:58
 */
public class ThreadLocalUtil {

  private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

  public static String get() {
    return threadLocal.get();
  }

  public static void set(String value) {
    threadLocal.set(value);
  }

}
