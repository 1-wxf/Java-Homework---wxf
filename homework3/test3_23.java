/**
 * @author WXF
 * @data 2021-03-22
 * @description ��д������ʾ�û������(x,y), Ȼ����õ��Ƿ�����ԭ��(0,0)Ϊ���ġ���Ϊ10����Ϊ5�ľ����С�
*/

package homework3;
import java.util.Scanner;
public class test3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        if((a <= 5 && a >= -5) && (b >= -2.5 && b <= 2.5))
            System.out.println(String.format("point (%.1f, %.1f) is in the rectangle", a, b));
        else
            System.out.println(String.format("point (%.1f, %.1f) is not in the rectangle", a, b));
	}
}
	
