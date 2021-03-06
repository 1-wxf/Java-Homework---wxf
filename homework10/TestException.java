/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description 程序清单 12-6 给出了一个例子，它使用 Throwable 中的方法来显示异常信息。第4 行调用 sum 方法返回数组中所有元素的和。
 */

package homework10;

public class TestException  {
	  public static void main(String[] args) {
	    try {
	      System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
	    }
	    catch (Exception ex) {
	      ex.printStackTrace();
	      System.out.println("\n" + ex.getMessage());
	      System.out.println("\n" + ex.toString());

	      System.out.println("\nTrace Info Obtained from getStackTrace");
	      StackTraceElement[] traceElements = ex.getStackTrace();
	      for (int i = 0; i < traceElements.length; i++) {
	        System.out.print("method " + traceElements[i].getMethodName());
	        System.out.print("(" + traceElements[i].getClassName() + ":");
	        System.out.println(traceElements[i].getLineNumber() + ")");
	      }
	    }
	  }

	  private static int sum(int[] list) {
	    int result = 0;
	    for (int i = 0; i <= list.length; i++)
	      result += list[i];
	    return result;
	  }
	}
