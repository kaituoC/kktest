package vip.dreamaker.kktest.test;

/**
 * @author changkaituo
 * @date 2020/4/17 16:26
 */
public class JustTest {

  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = "Java";
    String s3 = new String("Java");
    String s4 = new String("Java");
    System.out.println(s1 == s2);
    System.out.println(s3 == s4);
  }

}
