/**
 * @author WXF
 * @data 2021-04-25
 * @description 为一个 2x 2 的线性方程设计一个名为 LinearEquation 的类
*/

package homework6;

public class test9_11LinearEquation {
	private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double x;
    private double y;
    public test9_11LinearEquation(){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
//        this(a,b,c,d,e,f);
    }
    public double getA(){
        return this.a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    public boolean isSolvable(){
        if((a*d-b*c)!=0) return true;
        else return false;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
