/**
 * @author WXF
 * @data 2021-03-22
 * @description 编写程序，提示用户输人两个圆的中心坐标和各自的半径值，然后决定第二个圆是在第一个圆内，还是和第一个圆重叠
*/
package homework3;
import java.util.Scanner;
public class test3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double[] circle1 = new double[3];
		double[] circle2 = new double[3];

		System.out.println("Enter circle1's x-, y-coordinates, and radius: ");
		for (int i = 0; i < 3; ++i) {
			circle1[i] = scan.nextDouble();
		}

		System.out.println("Enter circle2's x-, y-coordinates, and radius: ");
		for (int i = 0; i < 3; ++i) {
			circle2[i] = scan.nextDouble();
		}

		double distance;
		scan.close();
		distance = Math.sqrt((circle1[0] - circle2[0]) * (circle1[0] - circle2[0])
				+ (circle1[1] - circle2[1]) * (circle1[1] - circle2[1]));
		if (distance <= Math.abs(circle1[2] - circle2[2])) {
			System.out.println("circle2 is inside circle1");
		} else if (distance <= circle1[2] + circle2[2]) {
			System.out.println("circle2 overlaps circle1");
		} else {
			System.out.println("circle2 does not overlap circle1");
		}
	}

}

		
				