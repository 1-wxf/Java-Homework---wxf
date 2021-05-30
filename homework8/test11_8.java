/**
 * @author WXF
 * @data 2021-05-17
 * @description  编写一个测试程序，创建一个年利率为1.5%、收支额为 1000、id 为 1122 而名字为George 的 Account。向该账户存入 30 美元、40 美元和 50 美元并从该账户中取出 5 美元、4 美元和 2 美元。打印账户清单，显示账户持有者名字、利率、收支额和所有的交易。
*/
package homework8;
import java.util.ArrayList;
public class test11_8 {
	public static void main(String[] args) {
		//用于为账户存储交易
		//ArrayList<Object> transactions=new ArrayList<>();
		test11_8NewAccount object=new test11_8NewAccount("George", 1122, 1000);  
		object.setAnnualInterestRate(0.015);
		
		object.deposit(30);
		object.deposit(40);
		object.deposit(50);
		
		object.withDraw(5);
		object.withDraw(4);
		object.withDraw(2);
		
		System.out.println("账户持有者名字： "+object.getName()
					+ "\n利率: "+object.getAnnualInterestRate()
					+ "\n收支额： "+object.getBalance()
					+ "\n所有的交易:"+object.toString());
	}
}
