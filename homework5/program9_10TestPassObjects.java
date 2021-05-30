/**
 * @author WXF
 * @data 2021-04-19
 * @description 展示传递基本类型值和传递引用值的差异
*/
package homework5;

public class program9_10TestPassObjects {
	/** Main method */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Circle object with radius 1
		program9_8CircleWithPrivateDataFields myCircle = 
				  new program9_8CircleWithPrivateDataFields(1);
				
				// Print areas for radius 1, 2, 3, 4, and 5.
				int n = 5;
				printAreas(myCircle, n);
				
				// See myCircle.radius and times
				System.out.println("Radius is " + myCircle.getRadius());
				System.out.println("n is " + n);
			}
			
			/** Print a table of areas for radius */
			public static void printAreas(
					program9_8CircleWithPrivateDataFields c, int times) {
				System.out.println("Radius \t\tArea");
				while(times >= 1) {
					System.out.println(c.getRadius() + "\t\t" + c.getArea());
					c.setRadius(c.getRadius() + 1);
					times--;
				}
			}

		}

	
