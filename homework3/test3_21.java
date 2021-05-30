/**
 * @author WXF
 * @data 2021-03-22
 * @description编写程序，提示用户输入年、月和该月的哪一天，然后显示它是一周中的星期几。
*/

package homework3;
import java.util.Scanner;
public class test3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] day = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012): ");
		int year = scan.nextInt();
		System.out.println("Enter month: 1-12: ");
		int month = scan.nextInt();
		System.out.println("Enter the day of the month: 1-31: ");
		int q = scan.nextInt();
		int h;
		scan.close();
		if (month == 1 || month == 2) {
			month += 12;
			year -= 1;
		}
		h = (q + (int) (26 * (month + 1) / 10) + year % 100 + (int) (year % 100 / 4) + (int) (year / 400)
				+ (int) (5 * year / 100)) % 7;
		System.out.println(String.format("Day of the week is %s", day[h]));
	}

}



		

		
				