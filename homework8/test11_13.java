package homework8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test11_13 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>(); // ����һ���б�

		// ��ȡ10���������б�
		System.out.println("Enter ten integers:");
		for (int i = 0; i < 10; i++) {
			list.add(keyboard.nextInt());
		}
		keyboard.close();

		// ȥ���ظ�Ԫ��
		removeDuplicate(list);
	}

	public static void removeDuplicate(ArrayList<Integer> list) {

		List<Integer> set = new ArrayList<>();

		// ������ظ�Ԫ��
		System.out.print("The distinct integers are");
		for (int i = 0; i < list.size(); i++) {
			if (!set.contains(list.get(i))) {
				set.add(list.get(i));
				System.out.print(" " + list.get(i));
			}
		}

	}

}

