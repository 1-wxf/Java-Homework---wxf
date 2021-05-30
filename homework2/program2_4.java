/**
 * @author WXF
 * @data 2021-03-15
 * @description将 π 声明为常量，求圆的面积
 */
package homework2;
import java.util.Scanner;
public class program2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius:");
		double radius = input.nextDouble();
		double area = radius*radius*PI;
		System.out.println("The area for the circle of radius " + 
		  radius + " is " + area);
	}
}
