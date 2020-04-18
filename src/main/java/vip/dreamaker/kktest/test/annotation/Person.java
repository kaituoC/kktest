package vip.dreamaker.kktest.test.annotation;

/**
 * @author changkaituo
 * @date 2020/4/17 11:58
 */
@Table("person")
public class Person {

  @Column("name")
  private String name;
  @Column("user_name")
  private String userName;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
