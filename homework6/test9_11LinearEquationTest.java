/**
 * @author WXF
 * @data 2021-04-25
 * @description编写一个测试程序，提示用户输入 a、b、c、d、e、f的值，然后显示它的结果。如果 ad-bc 为 0 , 就报告 “ The equation has no solution.”
*/
package homework6;
import java.util.Scanner;
public class test9_11LinearEquationTest {
	 public static void main(String[] args) {
	        System.out.println("enter a,b,c,d,e,f:");
	        Scanner scanner = new Scanner(System.in);
	        double a,b,c,d,e,f;
	        a=scanner.nextDouble();
	        b=scanner.nextDouble();
	        c=scanner.nextDouble();
	        d=scanner.nextDouble();
	        e=scanner.nextDouble();
	        f=scanner.nextDouble();
	        test9_11LinearEquation linearEquation = new test9_11LinearEquation();
	        if((a*d-b*c)==0){
	            System.out.println("The equation has no solution");
	        }else{
	            linearEquation.setX((e*d-b*f)/(a*d-b*c));
	            linearEquation.setY((a*f-e*c)/(a*d-b*c));
	            System.out.println(linearEquation.getX()+" "+linearEquation.getY());
	        }
	    }
	}


