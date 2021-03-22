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



		





















	
