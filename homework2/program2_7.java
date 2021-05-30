/**
 * @author WXF
 * @data 2021-03-15
 * @description获取当前时间，计算出当前的秒数、分钟数和小时数
*/

package homework2;

public class program2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		System.out.println("Current time is " + currentHour + ":"
		  + currentMinute + ":" + currentSeconds + " GMT");

	}

}
