/**
 * @author WXF
 * @data 2021-05-17
 * @description  编写测试程序，提示用户输入 10 个整数到列表中，显示其中不同的整数，并以一个空格分隔的方式来进行显示，使用下面的方法头编写方法，从一个整数的数组列表中去掉重复元素。
*/

package homework8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test11_13 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>(); // 创建一个列表

		// 读取10个整数到列表
		System.out.println("Enter ten integers:");
		for (int i = 0; i < 10; i++) {
			list.add(keyboard.nextInt());
		}
		keyboard.close();

		// 去除重复元素
		removeDuplicate(list);
	}

	public static void removeDuplicate(ArrayList<Integer> list) {

		List<Integer> set = new ArrayList<>();

		// 输出非重复元素
		System.out.print("The distinct integers are");
		for (int i = 0; i < list.size(); i++) {
			if (!set.contains(list.get(i))) {
				set.add(list.get(i));
				System.out.print(" " + list.get(i));
			}
		}

	}

}

