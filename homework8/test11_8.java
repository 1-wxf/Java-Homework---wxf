/**
 * @author WXF
 * @data 2021-05-17
 * @description  ��дһ�����Գ��򣬴���һ��������Ϊ1.5%����֧��Ϊ 1000��id Ϊ 1122 ������ΪGeorge �� Account������˻����� 30 ��Ԫ��40 ��Ԫ�� 50 ��Ԫ���Ӹ��˻���ȡ�� 5 ��Ԫ��4 ��Ԫ�� 2 ��Ԫ����ӡ�˻��嵥����ʾ�˻����������֡����ʡ���֧������еĽ��ס�
*/
package homework8;
import java.util.ArrayList;
public class test11_8 {
	public static void main(String[] args) {
		//����Ϊ�˻��洢����
		//ArrayList<Object> transactions=new ArrayList<>();
		test11_8NewAccount object=new test11_8NewAccount("George", 1122, 1000);  
		object.setAnnualInterestRate(0.015);
		
		object.deposit(30);
		object.deposit(40);
		object.deposit(50);
		
		object.withDraw(5);
		object.withDraw(4);
		object.withDraw(2);
		
		System.out.println("�˻����������֣� "+object.getName()
					+ "\n����: "+object.getAnnualInterestRate()
					+ "\n��֧� "+object.getBalance()
					+ "\n���еĽ���:"+object.toString());
	}
}
