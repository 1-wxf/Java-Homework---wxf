/**
 * @author WXF
 * @data 2021-04-26
 * @description  提示用户输人一个数字序列，然后显示该序列中的不同数字。假设输入0表示结束输入，并且 0 不计入序列中的数字。
*/
package homework7;
import java.util.ArrayList;
import java.util.Scanner;
public class program11_9DistinctNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers (input edns with 0): ");
		int value;

		do {
			value = input.nextInt(); // Read a value from the input

			if (!list.contains(value) && value != 0) {
				list.add(value); // Add the value if it is not in the list
			}
		} while (value != 0);

		input.close();

		// Display the distinct numbers
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}