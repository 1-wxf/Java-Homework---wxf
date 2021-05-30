/**
 * @author WXF
 * @data 2021-05-17
 * @description  编写一个程序，提示用户输入一个整数 m, 然后找到最小的整数 n, 使得m*n 是一个完全平方。
*/
package homework8;
import java.util.*;
public class test11_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer m: ");
        int m=input.nextInt();
        int flag=m;
        int i=2;
        int n=1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> list1=new ArrayList<Integer>();
        int []a=new int[1000];
        while(m!=1) {
            if(m%i==0) {
                list.add(i);
                m=m/i;
                a[i]++;
            }
            else
                i++;    
        }
        for(int j=0;j<1000;j++)
        {
            if(a[j]!=0&&(a[j]%2==1))
                n=n*j;
        }
        System.out.print("The smallest number n for m * n to be a perfect square is ");
        System.out.println(n);
        System.out.print("m * n  is ");
        System.out.println(n*flag);
    }
}
