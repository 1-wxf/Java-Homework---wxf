/**
 * @author WXF
 * @data 2021-03-15
 * @description将营业税值显示为小数点后两位
*/
package homework2;
import java.util.Scanner;

public class program2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter purchase amount: ");
		double purchaseAmount =input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);

	}

}
