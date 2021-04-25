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

