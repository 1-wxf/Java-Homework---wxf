/**
 * @author WXF
 * @data 2021-04-25
 * @description ��д���������ʾ��ǰ���ꡢ�º�Ի������ֵ����Ϊ 1234567898765L, Ȼ����ʾ����ꡢ�º��ա�
*/

package homework6;
import java.util.GregorianCalendar;
public class test9_5GetDate {
	public static void main(String[] args) {
		// ��ʾ��ǰʱ��
		GregorianCalendar year = new GregorianCalendar();
		GregorianCalendar month = new GregorianCalendar();
		GregorianCalendar day = new GregorianCalendar();
		System.out.println(String.format("%d-%d-%d", year.get(GregorianCalendar.YEAR),
				month.get(GregorianCalendar.MONTH) + 1, day.get(GregorianCalendar.DAY_OF_MONTH)));

		// ��ʾ�ض�ʱ��
		long timeInMillis = 123456789765L;
		year.setTimeInMillis(timeInMillis);
		month.setTimeInMillis(timeInMillis);
		day.setTimeInMillis(timeInMillis);
		System.out.println(String.format("%d-%d-%d", year.get(GregorianCalendar.YEAR),
				month.get(GregorianCalendar.MONTH) + 1, day.get(GregorianCalendar.DAY_OF_MONTH)));
	}

}
