package homework8;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class test11_9 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random(); // �����������0��1
		System.out.println("Enter the array size n: ");
		int arraySize = keyboard.nextInt(); // ���������С
		keyboard.close();

		int[][] array = new int[arraySize][arraySize]; // ����n��*n�еľ���
		List<Integer> list = new ArrayList<>();

		// �����0��1�������
		System.out.println("The random array is");
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize; j++) {
				array[i][j] = random.nextInt(2);
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}

		// ����1������
		int maxRow = 0;
		for (int i = 0; i < arraySize; i++) {
			int count = 0;
			for (int j = 0; j < arraySize; j++) {
				if (array[i][j] == 1) {
					++count;
				}
			}
			if (maxRow < count) {
				maxRow = count;
			}
			list.add(count);
		}

		// ���1������
		System.out.print("The largest row index:");
		for (int i = 0; i < arraySize; i++) {
			if (list.get(i).equals(maxRow)) {
				System.out.print(" " + i);
			}
		}

		list.clear(); // �������

		// ����1������
		int maxColumn = 0;
		for (int i = 0; i < arraySize; i++) {
			int count = 0;
			for (int j = 0; j < arraySize; j++) {
				if (array[j][i] == 1) {
					++count;
				}
			}
			if (maxColumn < count) {
				maxColumn = count;
			}
			list.add(count);
		}
		// ���1������
		System.out.print("\nThe largest column index:");
		for (int i = 0; i < arraySize; i++) {
			if (list.get(i).equals(maxColumn)) {
				System.out.print(" " + i);
			}
		}
	}
}
