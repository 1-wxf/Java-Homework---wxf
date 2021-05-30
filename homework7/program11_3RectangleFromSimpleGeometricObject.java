/**
 * @author WXF
 * @data 2021-04-26
 * @description Rectangle ¿‡
*/
package homework7;

public class program11_3RectangleFromSimpleGeometricObject extends program11_1SimpleGeometricObject { 
	private double width;
	private double height;

	public program11_3RectangleFromSimpleGeometricObject() {
	}

	public program11_3RectangleFromSimpleGeometricObject(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public program11_3RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Return height */
	public double getHeight() {
		return height;
	}

	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}

	/** Return area */
	public double getArea() {
		return width * height;
	}

	/** Return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}
}

