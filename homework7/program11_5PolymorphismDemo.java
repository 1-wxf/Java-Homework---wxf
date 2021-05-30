/**
 * @author WXF
 * @data 2021-04-26
 * @description 将子类的实例传给需要父类型的参数
*/
package homework7;

public class program11_5PolymorphismDemo {
	/** Main method */
	public static void main(String[] args) {
		// Display circle and rectangle properties
		displayObject(new program11_2CircleFromSimpleGeometricObject(1, "red", false));
		displayObject(new program11_3RectangleFromSimpleGeometricObject(1, 1, "black", true));
	}

	/** Display geometric object properties */
	public static void displayObject(program11_1SimpleGeometricObject object) {
		System.out.println("Created on " + object.getDateCreated() + " Color is " + object.getColor());

	}
}
