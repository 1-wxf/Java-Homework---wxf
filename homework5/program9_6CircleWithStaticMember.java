/**
 * @author WXF
 * @data 2021-04-19
 * @description 新的名为 CircleWithStaticMembers 的圆类的声明
*/
package homework5;

public class program9_6CircleWithStaticMember {
	 /** The radius of the circle */
    double radius;
    
    /** The number of objects created */
    static int numberOfObjects = 0;
            
    /** Construct a circle with radius 1 */
    program9_6CircleWithStaticMember() {
        radius = 1;
        numberOfObjects++;
    }
    
    /** Construct a circle with a specified radius */
    program9_6CircleWithStaticMember(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }
    
    /**Return numberOfObjects*/
    static int getNumberOfObjects() {
        return numberOfObjects;
    }
    
    /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;

    }
}
