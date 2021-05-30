/**
 * @author WXF
 * @data 2021-04-19
 * @description 以为给定x 和y 坐标的点来创建一个 Point2D 对象，使用 distance 方法计算该点到另外一个点之间的距离，并且使用 toString（）方法来返回该点的字符串表示
*/

package homework5;
import java.util.Scanner;
import java.awt.geom.Point2D;
public class program9_5TestPoint2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter point1's x-, y-coordinates: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point2's x-, y-coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        Point2D p1 = new Point2D.Double(x1,y1);
        Point2D p2 = new Point2D.Double(x2,y2);

        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        System.out.println("The distance between p1 and p2 is "
        + p1.distance(p2));

	}
}
