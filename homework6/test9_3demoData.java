/**
 * @author WXF
 * @data 2021-04-25
 * @description 编写程序创建一个 Date 对象，设置它的流逝时间分别为 10000、100000、1000000、10000000、100000000、1000000000、10000000000、100000000000, 然后使用toString()方法分别显示上述日期。
*/

package homework6;
import java.util.Date;
public class test9_3demoData {
	public static void main(String[] args) {
        long l=10000;
        Date date = new Date(l);
        for (int i = 0; i < 8; i++) {
            date.setTime(l);
            printDate(l,date);
            l*=10;
        }
    }

    public static void printDate(long l,Date date){
        System.out.println(l+": "+date.toString());
    }

}

