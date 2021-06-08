/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description 程序清单 12-2 解决这个错误的一个简单方法就是添加一个 if 语句来测试第二个数字
 */

package homework10;

import java.util.Scanner; 

public class QuotientWithIf {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    // Prompt the user to enter two integers
	    System.out.print("Enter two integers: ");
	    int number1 = input.nextInt();
	    int number2 = input.nextInt();
	    
	    if (number2 != 0)
	      System.out.println(number1 + " / " + number2 + " is " +
	        (number1 / number2));
	    else
	      System.out.println("Divisor cannot be zero ");
	  }
	}
