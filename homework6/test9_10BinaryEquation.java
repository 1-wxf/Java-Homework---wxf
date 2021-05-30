/**
 * @author WXF
 * @data 2021-04-25
 * @description Ϊ���η���ʽ���һ����Ϊ QuadraticEquation ���࣬��дһ�����Գ�����ʾ�û����� a��b �� c ��ֵ��Ȼ����ʾ�б�ʽ�Ľ��������б�ʽΪ��������ʾ������������б�ʽΪ 0, ��ʾһ������������ʾ ��The equation has no roots.��
*/

package homework6;
import java.util.Scanner;
public class test9_10BinaryEquation {
	public static void main(String[] args) {
		// ����
		Scanner keyboard = new Scanner(System.in);
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		keyboard.close();
		// ������
		QuadraticEquation equation = new QuadraticEquation();
		if (equation.getDiscriminant(a, b, c) > 0) {
			// ����������
			System.out.println(String.format("%.2f %.2f", equation.getRoot1(a, b, c), equation.getRoot2(a, b, c)));
		}
		else if (equation.getDiscriminant(a, b, c) == 0) {
			// ����һ����
			System.out.println(String.format("%.2f", equation.getRoot1(a, b, c)));
		}
		else {
			// û�и�
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