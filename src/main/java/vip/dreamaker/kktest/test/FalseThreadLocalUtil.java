package vip.dreamaker.kktest.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kaituo
 * @date 2019/11/19 21:00
 */
public class FalseThreadLocalUtil {

  private static final Map<Thread, String> map = new HashMap<>();

  public static String get() {
    return map.get(Thread.currentThread());
  }

  public static void set(String value) {
    Thread thread = Thread.currentThread();
    map.put(thread, value);
  }
}
