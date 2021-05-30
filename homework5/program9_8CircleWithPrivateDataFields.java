/**
 * @author WXF
 * @data 2021-04-19
 * @description 定义一个名为 CircleWithPrivateDataFields 的新的圆类，半径设置为私有数据域，并有相关的访问器和修改器
*/
package homework5;

public class program9_8CircleWithPrivateDataFields {
	/** The radius of the circle */
	private double radius = 1;
	
	/** The number of the objects created */
	private static int numberOfObjects = 0;
	
	/** Construct a circle width radius 1*/
	private program9_8CircleWithPrivateDataFields() {
		numberOfObjects++;
	}
	
	/** Construct a circle with a specified radius */
	public program9_8CircleWithPrivateDataFields(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	/** Return numberOfObjects */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
}

