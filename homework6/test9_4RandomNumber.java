/**
 * @author WXF
 * @data 2021-04-25
 * @description ��дһ�����򣬴��������� 1000�� Random ����Ȼ��ʹ��nextInt(lOO)������ʾ 0 �� 100 ֮��ǰ 50 ���������
*/

package homework6;
import java.util.Random;
public class test9_4RandomNumber {
	public static void main(String[] args) {
		Random random = new Random(1000);
		for (int i = 0; i < 50; i++) {
			System.out.println(random.nextInt(100));
		}
	}
}
