/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description �����嵥 12-3  ��д�����嵥 12-2 ��ʹ��һ������������
 */

package homework10;

import java.util.Scanner; 

public class QuotientWithMethod { 
	  public static int quotient(int number1, int number2) {
	    if (number2 == 0) {
	      System.out.println("Divisor cannot be zero");
	      System.exit(1);
	    }

	    return number1 / number2;
	  }
	  
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    // Prompt the user to enter two integers
	    System.out.print("Enter two integers: ");
	    int number1 = input.nextInt();
	    int number2 = input.nextInt();
	    
	    int result = quotient(number1, number2);
	    System.out.println(number1 + " / " + number2 + " is " 
	      + result);
	  }
}