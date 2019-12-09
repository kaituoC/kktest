package vip.dreamaker.kktest.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author kaituo
 * @date 2019/11/19 20:23
 */
public class ThreadLocalTest {

  static class MyThread extends Thread {

    private ThreadLocal<String> threadLocal = new ThreadLocal<>();
//    private ThreadLocal<Integer> threadLocal2 = new ThreadLocal<>();

    public MyThread() {

    }

    public MyThread(ThreadLocal<String> threadLocal) {
      this.threadLocal = threadLocal;
    }

    @Override
    public void run() {
      super.run();
      for (int i = 0; i < 3; i++) {
        String value = getName() + "-" + i;
        threadLocal.set(value);
        threadLocal.remove();
        ThreadLocalUtil.set(value);
        FalseThreadLocalUtil.set(value);
//        threadLocal2.set(i);
        System.out.println(getName() + " threadLocal.get()=" + threadLocal.get()
            + "\tThreadLocalUtil.get()=" + ThreadLocalUtil.get()
            + "\tFalseThreadLocalUtil.get()=" + FalseThreadLocalUtil.get());
//        System.out.println(getName() + " threadLocal2.get() = " + threadLocal2.get());

        try {
          Method getMap = threadLocal.getClass().getDeclaredMethod("getMap", Thread.class);
          System.out.println(getMap.toGenericString());
          Object invoke = getMap.invoke(new Object(), Thread.currentThread());
          System.out.println("invoke:" + invoke);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
          e.printStackTrace();
        }
        String className = "java.lang.ThreadLocal";
//        try {
////          Class<?> aClass = Class.forName(className);
//          Method[] methods = threadLocal.getClass().getMethods();
//          for (Method method : methods) {
//            System.out.println("method.getName()=" + method.getName());
//          }
//
//          TimeUnit.SECONDS.sleep(2);
//        } catch (InterruptedException e) {
//          e.printStackTrace();
//        }
      }
    }
  }

  public static void main(String[] args) {
    ThreadLocal<String> threadLocal = new ThreadLocal<>();
    MyThread myThreadA = new MyThread(threadLocal);
    myThreadA.setName("ThreadA");

    MyThread myThreadB = new MyThread(threadLocal);
    myThreadB.setName("ThreadB");

    myThreadA.start();
    myThreadB.start();
  }
}
