/**
 * @encoding UTF-8
 * @author WXF
 * @data 2021-06-07
 * @description 程序清单 12-10 须创建自定义异常类
 */

package homework10;

public class InvalidRadiusException extends Exception {
  private double radius;

  /** Construct an exception */
  public InvalidRadiusException(double radius) {
    super("Invalid radius " + radius);
    this.radius = radius;
  }

  /** Return the radius */
  public double getRadius() {
    return radius;
  }
}
