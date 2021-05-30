/**
 * @author WXF
 * @data 2021-04-25
 * @description 编写一个程序，创建种子是 1000的 Random 对象，然后使用nextInt(lOO)方法显示 0 到 100 之间前 50 个随机整数
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
