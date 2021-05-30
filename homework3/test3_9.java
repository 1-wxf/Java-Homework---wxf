/**
 * @author WXF
 * @data 2021-03-22
 * @description 编写程序，提示用户输人前 9 个数，然后显示 10 位 ISBN (包括前面起始位置的 0 >。程序应该读取一个整数输入。
 */
package homework3;
import java.util.Scanner;
public class test3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first 9 digits of an integer:");
		Scanner input = new Scanner(System.in);
		String strNumber = input.next();
		String oldNumber = new String(strNumber);
		int result = 0;
		int index = 0;
		input.close();
		char[] number = strNumber.toCharArray();
		for (int i : number) {
			result += (i - '0') * (index + 1);
			index += 1;
		}
		result = result % 11;
		oldNumber += result == 10 ? 'X' : String.valueOf(result);
		System.out.println(oldNumber);
	}

}



		





















	
