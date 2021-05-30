/**
 * @author WXF
 * @data 2021-05-17
 * @description  ���һ����Ϊ transactions�� ArrayList ���͵���������.����Ϊ�˻��洢���ס�ÿ�ʽ��׶���һ�� Transaction ���ʵ����
*/
package homework8;
import java.util.Date;
public class test11_8Transaction {
	//��������
	private java.util.Date date;
	
	//�������ͣ�����'W','D'
	private char type;
	
	//������
	private double amount;
	
	//���׺�������
	private double balance;
	
	//��������
	private String description;

	//һ���вι��췽��
	public test11_8Transaction(char type, double amount, double balance, String description) {
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
		
		//����һ����������
		date=new Date();
		this.date=date;
	}
	
	//��ý�������
	public String getDate() {
		return date.toString();
	
	}
	
	//���ý�������
	public void setDate(long eclapseTime) {
		date.setTime(eclapseTime);
	}
	
	//�������ͣ���W������ȡ���D���������
	public char getType() {
		return type;
	
	}
	
	public void setType(char type) {
		this.type=type;
	}
	
	public double getAmount() {
		return amount;
	
	}
	
	public void setAmount(double amount) {
		this.amount=amount;
	}
	
	public double getBalance() {
		return balance;
	
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public String getDescription() {
		return description;
	
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
}

