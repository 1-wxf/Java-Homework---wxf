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