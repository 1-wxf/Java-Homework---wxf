/**
 * @author WXF
 * @data 2021-03-15
 * @description控制台读取半径输入求圆的面积
 */
package homework2;
import java.util.Scanner;
public class program2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius:");
		double radius = input.nextDouble();
		double area = radius*radius*3.14159;
		System.out.println("The area for the circle of radius " + 
		  radius + " is " + area);
	}
}
