/**
 * @author WXF
 * @data 2021-04-25
 * @description 编写程序完成显示当前的年、月和曰，将这值设置为 1234567898765L, 然后显示这个年、月和日。
*/

package homework6;
import java.util.GregorianCalendar;
public class test9_5GetDate {
	public static void main(String[] args) {
		// 显示当前时间
		GregorianCalendar year = new GregorianCalendar();
		GregorianCalendar month = new GregorianCalendar();
		GregorianCalendar day = new GregorianCalendar();
		System.out.println(String.format("%d-%d-%d", year.get(GregorianCalendar.YEAR),
				month.get(GregorianCalendar.MONTH) + 1, day.get(GregorianCalendar.DAY_OF_MONTH)));

		// 显示特定时间
		long timeInMillis = 123456789765L;
		year.setTimeInMillis(timeInMillis);
		month.setTimeInMillis(timeInMillis);
		day.setTimeInMillis(timeInMillis);
		System.out.println(String.format("%d-%d-%d", year.get(GregorianCalendar.YEAR),
				month.get(GregorianCalendar.MONTH) + 1, day.get(GregorianCalendar.DAY_OF_MONTH)));
	}

}
