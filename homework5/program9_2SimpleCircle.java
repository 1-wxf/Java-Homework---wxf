/**
 * @author WXF
 * @data 2021-04-19
 * @description 将两个类组合成一个
*/

package homework5;

public class program9_2SimpleCircle {

	public static void main(String[] args) {
		// Create a circle with radius 1
		program9_2SimpleCircle circle1 = new program9_2SimpleCircle();
        System.out.println("The area of the circle of radius "
                + circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius 25
        program9_2SimpleCircle circle2 = new program9_2SimpleCircle(25);
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());

        // Creat a circle with radius 125
        program9_2SimpleCircle circle3 = new program9_2SimpleCircle(125);
        System.out.println("The area of the circle of radius "
                + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.radius = 100;// or circle2.setRadius(100)
        System.out.println("The area of the circle of radius "
                + circle2.radius + " is " + circle2.getArea());
    }

    double radius;

    /** Construct a circle with a specified radius 1 */
    program9_2SimpleCircle(){
        radius = 1;
    }

    /** Construct a circle with a specified radius */
    program9_2SimpleCircle(double newRadius){
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
		
		
		
		
