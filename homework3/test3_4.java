/**
 * @author WXF
 * @data 2021-03-22
 * @description 编写一个随机产生1和12之间整数的程序，并且根据数字12显示相应的英文月份：January，February，…，December。
 */
package homework3;
import java.util.Random;
public class test3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int i = random.nextInt(12);
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println(i + 1);
		System.out.println(months[i]);
	}
}
	
