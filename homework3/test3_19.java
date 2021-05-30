/**
 * @author WXF
 * @data 2021-03-22
 * @description(计算三角形的周长）编写程序，读取三角形的三条边，如果输人值合法就计算这个三角形的周长；否则，显示这些输入值不合法。
*/

package homework3;
import java.util.Arrays;
import java.util.Scanner;
public class test3_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] side = new int[3];
		for (int i = 0; i < 3; ++i) {
			side[i] = scan.nextInt();
			if (side[i] < 0) {
				System.out.println("Invalid！");
				scan.close();
				return;
			}
		}
		scan.close();
		Arrays.sort(side);
		if (side[0] + side[1] > side[2]) {
			System.out.println(side[0] + side[1] + side[2]);
		} else {
			System.out.println("Invalid!");
		}
	}
	
}
		
		
				



	
		

	

		
				
				