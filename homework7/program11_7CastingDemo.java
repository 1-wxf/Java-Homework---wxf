package homework7;

public class program11_7CastingDemo {
	/** Main method */
	public static void main(String[] args) {
		// Create and initialize two objects
		Object object1 = new program11_2CircleFromSimpleGeometricObject(1);
		Object object2 = new program11_3RectangleFromSimpleGeometricObject(1, 1);

		// Display circle and rectangle
		displayObject(object1);
		displayObject(object2);
	}

	/** AA method for displaying an object */
	public static void displayObject(Object object) {
		if (object instanceof program11_2CircleFromSimpleGeometricObject) {
			System.out.println("The circle area is " + ((program11_2CircleFromSimpleGeometricObject) object).getArea());
			System.out.println("The circle diameter is " + ((program11_2CircleFromSimpleGeometricObject) object).getDiameter());

		} else if (object instanceof program11_3RectangleFromSimpleGeometricObject) {
			System.out.println("The rectangle area is " + ((program11_3RectangleFromSimpleGeometricObject) object).getArea());
		}
	}


}
