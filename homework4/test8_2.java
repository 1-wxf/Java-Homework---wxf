package homework4;
import java.util.Scanner;
public class test8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		double[][] m=new double[4][4];
		
		for(int row=0; row<m.length; row++) {
			for(int column=0; column<m[row].length; column++) {
				m[row][column]=input.nextDouble();
			}
		}
		
		input.close();
		
		System.out.println("Sum of the elements in the major diagonal is "
				+sumMajorDiagonal(m));  
 
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum=0;
		
		for(int row=0; row<m.length; row++) {
			sum += m[row][row];
		}
		
		return sum;

	}

}
