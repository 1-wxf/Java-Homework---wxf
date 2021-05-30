/**
 * @author WXF
 * @data 2021-03-29
 * @description 编写一个方法，使用下面的方法头对二维数组排序，首先按行排序，然后按列排序 public static void sort（int m[][]）
 */
package homework4;
import java.util.Scanner;
public class test8_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner cin = new Scanner(System.in);
	        System.out.println("Please enter six pairs：");
	        int[][] arr = new int[6][2];
	        for(int i = 0; i < 6; ++i){
	            arr[i][0] = cin.nextInt();
	            arr[i][1] = cin.nextInt();
	        }

	        sort(arr);

	        for(int i = 0; i < 6; ++i){
	            System.out.println("{" + arr[i][0] +  "," + arr[i][1] + "}");
	        }
	    }

	    public static void sort(int m[][]){
	        int[] temp = null;
	        for(int i = 0; i < (int)m.length - 1; ++i){
	            for(int j = i+1; j < (int)m.length; ++j){
	                if(compareInt(m[i],m[j]) > 0){
	                    temp = m[i];
	                    m[i] = m[j];
	                    m[j] = temp;
	                }
	            }
	        }
	    }

	    public static int compareInt(int[] a, int[] b){
	        int len = a.length < b.length ? a.length : b.length;
	        for(int i = 0; i < len; ++i){
	            if(a[i] > b[i])
	                return 1;
	            else if(a[i] < b[i])
	                return -1;
	        }
	        if(a.length > b.length)
	            return 1;
	        else if(a.length < b.length)
	            return -1;
	        else
	            return 0;
	}
}

