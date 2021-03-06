/**
 * @author WXF
 * @data 2021-04-25
 * @description 为二次方程式设计一个名为 QuadraticEquation 的类，编写一个测试程序，提示用户输人 a、b 和 c 的值，然后显示判别式的结果。如果判别式为正数，显示两个根；如果判别式为 0, 显示一个根；否则，显示 “The equation has no roots.”
*/

package homework6;
import java.util.Scanner;
public class test9_10BinaryEquation {
	public static void main(String[] args) {
		// 输入
		Scanner keyboard = new Scanner(System.in);
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		keyboard.close();
		// 调用类
		QuadraticEquation equation = new QuadraticEquation();
		if (equation.getDiscriminant(a, b, c) > 0) {
			// 存在两个根
			System.out.println(String.format("%.2f %.2f", equation.getRoot1(a, b, c), equation.getRoot2(a, b, c)));
		}
		else if (equation.getDiscriminant(a, b, c) == 0) {
			// 存在一个根
			System.out.println(String.format("%.2f", equation.getRoot1(a, b, c)));
		}
		else {
			// 没有根
			System.out.println("The equation has no roots.");	
		}
	}
}
class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	public QuadraticEquation() {
		this.a = 1;
		this.b = 1;
		this.c = 1;
	}
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	public double getDiscriminant(double a, double b, double c) {
		return b * b - 4 * a * c;
	}
	public double getRoot1(double a, double b, double c) {
		if (getDiscriminant(a, b, c) >= 0) {
			return (-b + Math.sqrt(getDiscriminant(a, b, c))) / 2 * a;
		}
		else {
			return 0;
		}
	}
	public double getRoot2(double a, double b, double c) {
		if (getDiscriminant(a, b, c) >= 0) {
			return (-b - Math.sqrt(getDiscriminant(a, b, c))) / 2 * a;
			}
		else {
			return 0;
		}
	}
}
