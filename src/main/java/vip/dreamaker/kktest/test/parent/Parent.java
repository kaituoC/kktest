package vip.dreamaker.kktest.test.parent;

import com.alibaba.fastjson.JSON;

/**
 * @author kaituo
 * @date 2019/12/31 20:01
 */
public abstract class Parent {

  public void process() {
    System.out.println("name::" + this.getClass().getSimpleName());
    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
    System.out.println(JSON.toJSONString(stackTrace));
    before();
    around();
    after();
  }

  protected abstract void after();

  protected abstract void around();

  protected abstract void before();
}
