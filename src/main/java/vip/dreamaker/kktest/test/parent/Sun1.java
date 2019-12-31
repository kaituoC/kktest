package vip.dreamaker.kktest.test.parent;

/**
 * @author kaituo
 * @date 2019/12/31 20:04
 */
public class Sun1 extends Parent {

  @Override
  protected void after() {
    System.out.println(
        this.getClass().getSimpleName() + "--" + Thread.currentThread().getStackTrace()[1]
            .getMethodName());
  }

  @Override
  protected void around() {
    System.out.println(
        this.getClass().getSimpleName() + "--" + Thread.currentThread().getStackTrace()[1]
            .getMethodName());
  }

  @Override
  protected void before() {
    System.out.println(
        this.getClass().getSimpleName() + "--" + Thread.currentThread().getStackTrace()[1]
            .getMethodName());
  }
}
