/**
 * @author WXF
 * @data 2021-03-22
 * @description 编写一个程序，提示用户输入两个矩形中点的 x坐标和y坐标以及它们的宽度和高度，然后判定第二个矩形是在第一个矩形内，还是和第一个矩形重叠
*/
package homework3;
import java.util.Scanner;
public class test3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		double[] Rectangle1 = new double[4];
		double[] Rectangle2 = new double[4];
		double distance1;
		double distance2;

		System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
		for (int i = 0; i < 4; ++i) {
			Rectangle1[i] = scan.nextDouble(); // 读取第一个矩形的x,y,width,height
		}

		System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
		for (int i = 0; i < 4; ++i) {
			Rectangle2[i] = scan.nextDouble(); // 读取第二个矩形的x,y,width,height
		}

		scan.close();

		distance1 = Math.abs(Rectangle1[0] - Rectangle2[0]); // x的距离
		distance2 = Math.abs(Rectangle1[1] - Rectangle2[1]); // y的距离

		if (distance1 <= (Rectangle1[2] - Rectangle2[2]) && distance2 < (Rectangle1[3] - Rectangle2[3])) {
			System.out.println("r2 is inside r1");
		} else if (distance1 <= (Rectangle1[2] + Rectangle2[2]) && distance2 <= (Rectangle1[3] + Rectangle2[3])) {
			System.out.println("r2 overlaps r1");
		} else {
			System.out.println("r2 does not overlap r1");
		}
	}

}

		

				
