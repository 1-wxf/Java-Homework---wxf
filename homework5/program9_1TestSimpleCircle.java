/**
 * @author WXF
 * @data 2021-04-19
 * @description 定义 Circle 类并使用该类创建对象的程序。程序构造了三个圆对象，其半径分别为 1、25 和 125, 然后显示这三个圆的半径和面积。然后将第二个对象的半径改为 100, 并显示它的新半径和面积。
 */
package homework5;
public class program9_1TestSimpleCircle {

	public static void main(String[] args) {
		// Create a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius "
        + circle1.radius + " is " + circle1.getArea());

        // Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());

        // Creat a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius "
        + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.radius = 100;// or circle2.setRadius(100)
        System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());
    }
}
		
