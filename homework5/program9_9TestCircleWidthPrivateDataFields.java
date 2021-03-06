/**
 * @author WXF
 * @data 2021-04-19
 * @description 使用Circle 类创建一个 Circle 对象，然后使用setRadius 方法修改它的半径。
*/
package homework5;

public class program9_9TestCircleWidthPrivateDataFields {
	/** Main method */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a circle width radius 5.0
		program9_8CircleWithPrivateDataFields myCircle = 
				  new program9_8CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius "
		  + myCircle.getRadius() + " is " + myCircle.getArea());
		
		// Increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of circle of radius "
	      + myCircle.getRadius() + " is " + myCircle.getArea());
				
		System.out.println("The numbers of objects created is "
		  + program9_8CircleWithPrivateDataFields.getNumberOfObjects());

	}

}
