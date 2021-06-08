/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description �����嵥 12-8 ����ʹ���� Circle ��Ĳ��Գ���
 */

package homework10;

public class TestCircleWithException {
  public static void main(String[] args) {
    try {
      CircleWithException c1 = new CircleWithException(5);
      CircleWithException c2 = new CircleWithException(-5);
      CircleWithException c3 = new CircleWithException(0);
    }
    catch (IllegalArgumentException ex) {
      System.out.println(ex);
    }

    System.out.println("Number of objects created: " +
      CircleWithException.getNumberOfObjects());
  }
}

