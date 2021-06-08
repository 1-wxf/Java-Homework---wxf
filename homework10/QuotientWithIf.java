/**
 * @author WXF
 * @data 2021-06-07
 * @description —个简单的Java 程序
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
