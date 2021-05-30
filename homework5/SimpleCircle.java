/**
 * @author WXF
 * @data 2021-04-19
 * @description 定义 Circle 类并使用该类创建对象的程序。程序构造了三个圆对象，其半径分别为 1、25 和 125, 然后显示这三个圆的半径和面积。然后将第二个对象的半径改为 100, 并显示它的新半径和面积。
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


