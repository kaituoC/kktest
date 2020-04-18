package vip.dreamaker.kktest.test.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author changkaituo
 * @date 2020/4/17 12:00
 */
public class AnnotationTest {

  public static void main(String[] args) {
    Person person = new Person();
    person.setName("p_name");
    person.setUserName("p_user_name");
    String str = query(person);
    System.out.println(str);

  }

  private static String query(Person person) {
    StringBuilder sb = new StringBuilder();
    Class p = person.getClass();
    boolean annotationPresent = p.isAnnotationPresent(Table.class);
    if (!annotationPresent) {
      return "not annotationPresent";
    }
    Table table = (Table) p.getAnnotation(Table.class);
    String tableName = table.value();
    sb.append("select * from ").append(tableName);
    boolean firstArg = true;
    Field[] fields = p.getDeclaredFields();
    for (Field field : fields) {
      boolean fExist = field.isAnnotationPresent(Column.class);
      if (!fExist) {
        continue;
      }
      Column column = field.getAnnotation(Column.class);
      String columnName = column.value();
      String fieldName = field.getName();
      Object fieldValue = null;
      String getMethodName =
          "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
      try {
        Method method = p.getMethod(getMethodName);
        fieldValue = method.invoke(person);
      } catch (NoSuchMethodException e) {
        e.printStackTrace();
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      } catch (InvocationTargetException e) {
        e.printStackTrace();
      }
      if (fieldValue == null) {
        continue;
      }
      sb.append(firstArg ? " where " : " and ");
      firstArg = false;
      sb.append(columnName).append("=").append(fieldValue);
    }
    return sb.toString();
  }
}
