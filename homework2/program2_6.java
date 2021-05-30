/**
 * @author WXF
 * @data 2021-03-15
 * @description利用公式，将将华氏温度转换成摄氏温
 */

package homework2;
import java.util.Scanner;
public class program2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a dagree in Fahrenheit:");
		double fahrenheit = input.nextDouble();
		double celsius = (5.0/9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " +
		  celsius + " in Celsius");
	}
}
