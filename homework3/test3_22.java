/**
 * @author WXF
 * @data 2021-03-22
 * @description��д������ʾ�û�����һ����(x, y),Ȼ����������Ƿ�����ԭ��(0, 0) ΪԲ�ġ��뾶Ϊ 10 ��Բ�ڡ�
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
	

		
				
