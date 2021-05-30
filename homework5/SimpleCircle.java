/**
 * @author WXF
 * @data 2021-04-19
 * @description ���� Circle �ಢʹ�ø��ഴ������ĳ��򡣳�����������Բ������뾶�ֱ�Ϊ 1��25 �� 125, Ȼ����ʾ������Բ�İ뾶�������Ȼ�󽫵ڶ�������İ뾶��Ϊ 100, ����ʾ�����°뾶�������
*/
package homework5;
public class SimpleCircle {
	    double radius;

	    /** Construct a circle with a specified radius 1 */
	    SimpleCircle(){
	        radius = 1;
	    }

	    /** Construct a circle with a specified radius */
	    SimpleCircle(double newRadius){
	        radius = newRadius;
	    }

	    /** Return the area of this circle */
	    double getArea(){
	        return radius * radius * Math.PI;
	    }

	    /** Return the perimeter of this circle */
	    double getPrimeter(){
	        return 2 * radius * Math.PI;
	    }

	    /** Set a new radius for this circle */
	    void setRadius(double newRadius){
	        radius = newRadius;
	    }
	}


