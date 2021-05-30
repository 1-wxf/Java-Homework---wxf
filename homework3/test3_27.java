/**
 * @author WXF
 * @data 2021-03-22
 * @description 编写程序，提示用户输人一个点的；x坐标和y坐标，然后判定这个点是否在该三角形内。
*/

package homework3;
import java.util.Scanner;
public class test3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a point's x- and y-coodinates: ");
		double pointX = scan.nextDouble();
		double pointY = scan.nextDouble();
		scan.close();
		if (pointX + 2 * pointY < 200 && pointX > 0 && pointX < 200 && pointY > 0 && pointY < 100) {
			System.out.println("The point is in the triangle");
		} else {
			System.out.println("The point is not in the triangle");
		}
	}

}

		
				