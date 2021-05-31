/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-05-31
 * @description �ɿ���̨���չ̶���ʽ����ѧ����Ϣ������ѧ�ţ�������������Ϣ�������������Ϊexit�˳����������ѧ����Ϣ�ֱ��װ��һ��Student�����У��ٽ�ÿ��Student������뵽һ�������У�Ҫ�󼯺��е�Ԫ�ذ��������С�����������������ϣ���������ѧ����Ϣд�뵽���±���ÿ��ѧ������ռ����һ�С�
 */

package homework9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentMessage {
	/** Main method */
	public static void main(String[] args) {

		// create Scanner
		Scanner keyboard = new Scanner(System.in);

		// ����һ������, �洢Student����
		Set<Student> message = new TreeSet<Student>();

		while (true) {
			// ����һ������, �洢ѧ����Ϣ
			Student data = new Student();

			/* ѧ�Ų�Ϊexitʱ��, ��ѧ�Ŵ洢�������� */
			System.out.print("������ѧ��(����exit�˳�): ");
			String number = keyboard.next();
			if (number.equals("exit")) {
				break;
			} else {
				data.setNumber(number);
			}

			/* �������洢�������� */
			System.out.print("����������: ");
			data.setName(keyboard.next());

			/* ��������Ϣ�洢�������� */
			System.out.print("����������: ");
			data.setAge(keyboard.nextInt());

			// ��ѧ����Ϣ�洢������
			message.add(data);
		}

		// close Scanner
		keyboard.close();

		// д���ļ�
		try {
			FileOutputStream fileWriter = new FileOutputStream("./output.txt");
			fileWriter.write("\tѧ��\t����\t����\n".getBytes());
			for (Student data : message) {
				fileWriter.write(("\t" + data.getNumber()).getBytes());
				fileWriter.write(("\t" + data.getName()).getBytes());
				fileWriter.write(("\t" + String.valueOf(data.getAge()) + "\n").getBytes());
			}
			// �ر��ļ�
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

/** Student �� */
class Student implements Comparable<Student> {

	private String number;
	private String name;
	private int age;

	// ���췽��
	public Student() {
		/* ��ʼ������ */
		this.number = "";
		this.name = "";
		this.age = 0;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if (this.number.equals(o.getNumber())) {
			return -1;
		}
		return this.age - o.getAge();
	}

}
