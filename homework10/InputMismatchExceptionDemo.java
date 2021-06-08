/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description 程序清单 12-5 给出一个读入一个输人时处理 InputMismatchException的例子
 */

package homework10;

import java.util.*;

public class InputMismatchExceptionDemo {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    boolean continueInput = true;

	    do {
	      try {
	        System.out.print("Enter an integer: ");
	        int number = input.nextInt();
	  
	        // Display the result
	        System.out.println(
	          "The number entered is " + number);
	        
	        continueInput = false;
	      } 
	      catch (InputMismatchException ex) {
	        System.out.println("Try again. (" + 
	          "Incorrect input: an integer is required)");
	        input.nextLine(); // discard input 
	      }
	    } while (continueInput);
    }
}
