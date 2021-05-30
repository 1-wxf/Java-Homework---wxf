/**
 * @author WXF
 * @data 2021-03-22
 * @description编写程序，提示用户输人一个点(x, y),然后检査这个点是否在以原点(0, 0) 为圆心、半径为 10 的圆内。
*/

package homework3;
import java.util.Scanner;
public class test3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double pointX = scan.nextDouble();
		double pointY = scan.nextDouble();
		scan.close();
		if (pointX * pointX + pointY * pointY < 100) {
			System.out.println(String.format("Point (%.1f, %.1f) is in the circle", pointX, pointY));
		} else {
			System.out.println(String.format("Point (%.1f, %.1f) is not in the circle", pointX, pointY));
		}
	}

}
	

		
				
