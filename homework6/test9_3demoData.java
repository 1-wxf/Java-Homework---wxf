/**
 * @author WXF
 * @data 2021-04-25
 * @description ��д���򴴽�һ�� Date ����������������ʱ��ֱ�Ϊ 10000��100000��1000000��10000000��100000000��1000000000��10000000000��100000000000, Ȼ��ʹ��toString()�����ֱ���ʾ�������ڡ�
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

