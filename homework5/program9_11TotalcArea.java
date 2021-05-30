/**
 * @author WXF
 * @data 2021-04-19
 * @description 演示如何使用对象数组，求圆的数组的总面积，程序创建 5 个 Circle 对象组成的数组 circleArray, 接着使用随机值初始化这些圆的半径，然后显示数组中的圆的总面积
*/

package homework5;

public class program9_11TotalcArea {
	/** Main method */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare circleArray
		program9_8CircleWithPrivateDataFields[] circleArray;
		
		// Create circleArray
		circleArray = createCircleArray();
		
		// Print circleArray and total areas of the circles
		printCircleArray(circleArray);
	}
	
	/** Create an array of Circle objects */
	public static program9_8CircleWithPrivateDataFields[] createCircleArray() {
		program9_8CircleWithPrivateDataFields[] circleArray = 
		  new program9_8CircleWithPrivateDataFields[5];
		
		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] =
			  new program9_8CircleWithPrivateDataFields(Math.random() * 100);
		}
		
		// Return Circle array
		return circleArray;
	}
	
	/** Print an array of circles and their total area */
	public static void printCircleArray(
			program9_8CircleWithPrivateDataFields[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
			  circleArray[i].getArea());
		}
		
		System.out.println("---------------------------------------------");
		
		// Compute and display the results
		System.out.printf("%-30s%-15f\n", "The total area of circle is",
		  sum(circleArray) );
	}
	
	/** Add circle areas */
	public static double sum(program9_8CircleWithPrivateDataFields[] circleArray) {
		// Initialize sum
		double sum = 0;
	
	// Add areas to sum
	for (int i = 0; i < circleArray.length; i++)
		sum += circleArray[i].getArea();
	
	return sum;
	}

}

