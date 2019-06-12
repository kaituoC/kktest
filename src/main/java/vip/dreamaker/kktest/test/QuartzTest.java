package vip.dreamaker.kktest.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.quartz.CronExpression;

/**
 * @author kaituo
 * @date 2019-06-11 21:16
 */
public class QuartzTest {

  public static void main(String[] args) throws ParseException {
    String str1 = "* * 7-23 ? * MON-FRI";
    String str2 = "1111111111111111";
    System.out.println(str1.contains("*") + "--" + str2.contains("*"));

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    CronExpression cronExpression = new CronExpression("* * 7-23 ? * MON-FRI");

    boolean resCron = cronExpression.isSatisfiedBy(simpleDateFormat.parse("2018-06-11 06:50:00"));
    System.out.println("1=============="+resCron);
    boolean resCron1 = cronExpression.isSatisfiedBy(simpleDateFormat.parse("2018-06-11 23:00:00"));
    System.out.println("2=============="+resCron1);
  }

}
