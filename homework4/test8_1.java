/**
 * @author WXF
 * @data 2021-03-29
 * @description 编写一个方法，求整数矩阵中特定列的所有元素的和，编写一个测试程序，读取一个 3 x 4 的矩阵，然后显示每列元素的和。
 */
package homework4;
import java.util.Scanner;
public class test8_1 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		double[][] m=new double[3][4];
		
		for(int row=0; row<m.length; row++) {
			for(int column=0; column<m[row].length; column++) {
				m[row][column]=input.nextDouble();
			}
		}
		
		input.close();
		
		for(int column=0; column<4; column++) {
			System.out.println("Sum of the elements at column "+column+" is "
						+sumColumn( m, column));  
		}
		
		
 
	}
 
	public static double sumColumn(double[][] m, int columnIndex) {  
		double sum=0;
		
		for(int row=0; row<m.length; row++) {
			sum += m[row][columnIndex];
			
		}
		return sum;
		
	}
}