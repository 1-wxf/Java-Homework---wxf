package homework7;

public class program11_4TestCircleRectangle {
	public static void main(String[] args) {
		program11_2CircleFromSimpleGeometricObject circle = new program11_2CircleFromSimpleGeometricObject(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getArea());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());

		program11_3RectangleFromSimpleGeometricObject rectangle = new program11_3RectangleFromSimpleGeometricObject(2, 4);
		System.out.println("A rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
	}
}
