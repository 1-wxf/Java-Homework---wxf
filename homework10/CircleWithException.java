/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description 程序清单 12-7 定义了一个名为 CircleWithException的新的圆类，除了 setRadius(double
newRadius) 方法在参数 newRadius 为负时会抛出一个 IllegalArgumentExcepfion 异常之外，它
与 CircleWithPrivateDataFields 类是一样的。
 */

package homework10;

public class CircleWithException {
	  /** The radius of the circle */
	  private double radius;

	  /** The number of the objects created */
	  private static int numberOfObjects = 0;

	  /** Construct a circle with radius 1 */
	  public CircleWithException() {
	    this(1.0);
	  }

	  /** Construct a circle with a specified radius */
	  public CircleWithException(double newRadius) {
	    setRadius(newRadius);
	    numberOfObjects++;
	  }

	  /** Return radius */
	  public double getRadius() {
	    return radius;
	  }

	  /** Set a new radius */
	  public void setRadius(double newRadius)
	      throws IllegalArgumentException {
	    if (newRadius >= 0)
	      radius =  newRadius;
	    else
	      throw new IllegalArgumentException(
	        "Radius cannot be negative");
	  }

	  /** Return numberOfObjects */
	  public static int getNumberOfObjects() {
	    return numberOfObjects;
	  }

	  /** Return the area of this circle */
	  public double findArea() {
	    return radius * radius * 3.14159;
	  }
	}
