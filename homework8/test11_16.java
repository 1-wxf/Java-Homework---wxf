/**
 * @author WXF
 * @data 2021-05-17
 * @description  使用一个数组列表来存储答案，如果用户重复输入了相同的答案，则给出用户警告
*/
package homework8;
import java.util.ArrayList;
import java.util.Scanner;
public class test11_16 {
	public static void main(String[] args) {
		int number1=(int) (Math.random()*10);
		int number2=(int) (Math.random()*10);
		//创建一个数组，用来存放错误答案
		ArrayList<Integer> list=new ArrayList<>();
		Scanner input=new Scanner(System.in);
		System.out.print("What is "+number1+" + "+number2+"?");  
		int answer=input.nextInt();
		while(number1+number2!=answer) {
			if( !list.contains(answer) ) {
				list.add(answer);
			}
			else {
				System.out.println("You already entered "+answer);
			}
			
			
			System.out.print("Wrong answer.Try again.What is "
					+ number1+" + "+number2+"? ");
			answer=input.nextInt();
		}
		System.out.println("You got it!");
	}
}
