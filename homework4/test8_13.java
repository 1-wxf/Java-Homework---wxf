/**
 * @author WXF
 * @data 2021-03-29
 * @description 编写下面的方法，返回二维数组中最大元素的位置。
 */
package homework4;
import java.util.Scanner;
import java.util.Arrays;
public class test8_13 {
	public static int[] locateLargest(double[][] a) { 
		// TODO Auto-generated method stub
		int[] locateLargest = new int[2];
        double number = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                if (number <a[i][j]) {
                    number=a[i][j];
                    //两元素表示二维数组中最大元素的行下标和列下标
                    locateLargest[0] = i;
                    locateLargest[1] = j;
                }
            }
        }
     return locateLargest;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns of the array:");
        Scanner scanner = new Scanner(System.in);
        int ranks = scanner.nextInt();
        int column = scanner.nextInt();
        System.out.println("Enter the array:");
        double [][] array = new double[ranks][column];
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array[0].length ; j++) {
               array[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("The location of the largest element is at"+(Arrays.toString(locateLargest(array))));

	}

}

