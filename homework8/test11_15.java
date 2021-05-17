package homework8;
import java.util.Scanner;
public class test11_15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// �����ĸ���
		System.out.println("Enter the number of the points: ");
		int pointNumber = keyboard.nextInt();

		double[] x = new double[pointNumber];// ���������洢���������
		double[] y = new double[pointNumber];

		// ����������
		System.out.println("Enter the coordiates of the points:");
		for (int i = 0; i < pointNumber; i++) {
			x[i] = keyboard.nextDouble();
			y[i] = keyboard.nextDouble();
		}
		keyboard.close();

		// �������
		double area = 0;
		for (int i = 0; i < pointNumber; i++) {
			area += computeModule(x[i], y[i], x[(i + 1) % pointNumber], y[(i + 1) % pointNumber]);
		}
		System.out.println(String.format("The total area is %.3f", -area/2));
	}

	public static double computeModule(double a, double b, double c, double d) {
		return a * d - b * c;
	}
}
