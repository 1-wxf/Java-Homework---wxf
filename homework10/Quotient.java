/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description �����嵥 12-1 ��ʾ�쳣���������쳣����δ����Լ�����׳��ģ���ȡ������������ʾ���ǵ��̵�����
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