/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description 程序清单 12-1 演示异常处理，包括异常是如何创建以及如何抛出的，读取两个整数并显示它们的商的例子
 */

package homework10;

import java.util.Scanner; 

public class Quotient {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    // Prompt the user to enter two integers
	    System.out.print("Enter two integers: ");
	    int number1 = input.nextInt();
	    int number2 = input.nextInt();
	    
	    System.out.println(number1 + " / " + number2 + " is " +
	      (number1 / number2));
	  }
	}