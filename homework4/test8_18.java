/**
 * @author WXF
 * @data 2021-03-29
 * @description 编写一个方法，使用下面的方法头打乱一个二维整型数组的行，编写一个测试程序，打乱矩阵
 */
package homework4;
import java.util.Scanner;
public class test8_18 {
	 public static void main(String args[]){
	        int[][] m = {{1,2},{3,4},{5,6},{7,8},{9,10}};
	        shuffle(m);
	        for(int i = 0; i < m.length; ++i){
	            for(int j = 0; j < m[i].length; ++j){
	                System.out.print(m[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void shuffle(int[][] m){
	        int xlen = m.length;
	        int ylen = m[0].length;
	        for(int i = 0; i < xlen; ++i){
	            for(int j = 0; j < ylen; ++j){
	                int n = (int)(Math.random()*ylen);
	                int temp = m[i][n];
	                m[i][n] = m[i][j];
	                m[i][j] = temp;
	            }
	            int q = (int)(Math.random() * xlen);
	            int[] temp1 = m[q];
	            m[q] = m[i];
	            m[i] = temp1;
	        }
	    }
	}
