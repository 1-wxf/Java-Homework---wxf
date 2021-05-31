/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-05-31
 * @description  ʹ�������ӳ���Ŷ��ͼ����Ϣ�������������������Ʒ���ԣ���ţ����ƣ����ۣ������磻ʹ����Ʒ�����Ϊӳ���е�key��
*/

package homework9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BookData {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		List<Map<String, Map<String, String>>> message = new ArrayList<>();

		System.out.print("������Ҫ��Ŷ��ٱ�ͼ��: "); // ��ʾ����

		/* �������� */
		int bookNumbers = keyboard.nextInt(); // ͼ�������

		for (int i = 0; i < bookNumbers; i++) {
			// ����һ���ֵ�, �洢���
			Map<String, Map<String, String>> number = new TreeMap<>();

			// ����һ���ֵ�, �洢����
			Map<String, String> data = new LinkedHashMap<>();

			// ��ͼ���ŷŽ��ֵ�
			System.out.print("������ͼ��ı��: "); // ��ʾ����
			data.put("���", keyboard.next());

			// ��ͼ�����ƷŽ��ֵ�
			System.out.print("������ͼ�������: "); // ��ʾ����
			data.put("����", keyboard.next());

			// ��ͼ�鵥�۷Ž��ֵ�
			System.out.print("������ͼ��ĵ���: "); // ��ʾ����
			data.put("����", keyboard.next());

			// ��ͼ�������Ž��ֵ�
			System.out.print("������ͼ��ĳ�����: "); // ��ʾ����
			data.put("������", keyboard.next());

			// �ѱ�ź����ݷŽ��ֵ���
			number.put(data.get("���"), data);

			// �����ݷŽ��б�
			message.add(number);

			System.out.println("");
		}

//		System.out.println(message);

		keyboard.close();

		/* ����ͼ�����Ϣ */
		for (Map<String, Map<String, String>> map : message) {
			for (Map<String, String> data : map.values()) {
				System.out.println("*******************");
				for (Map.Entry<String, String> entry : data.entrySet()) {
					System.out.println(String.format("%s : %s", entry.getKey(), entry.getValue()));
				}
			}
		}
	}

}

