/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description 程序清单 12-4 重写Java 可以让一个方法可以抛出一个异常，该异常可以被调用者捕获和处理
 */

package homework10;

import java.util.Scanner;

public class QuotientWithException { 
	  public static int quotient(int number1, int number2) {
	    if (number2 == 0)
	      throw new ArithmeticException("Divisor cannot be zero");

	    return number1 / number2;
	  }
	  
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    // Prompt the user to enter two integers
	    System.out.print("Enter two integers: ");
	    int number1 = input.nextInt();
	    int number2 = input.nextInt();
	    
	    try {
	      int result = quotient(number1, number2);
	      System.out.println(number1 + " / " + number2 + " is " 
	        + result);
	    }
	    catch (ArithmeticException ex) {
	      System.out.println("Exception: an integer " + 
	        "cannot be divided by zero ");
	    }

	    System.out.println("Execution continues ...");
	  }
}
