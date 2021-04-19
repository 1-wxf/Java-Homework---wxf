package homework5;

public class SimpleCircle {
	    double radius;

	    /** Construct a circle with a specified radius 1 */
	    SimpleCircle(){
	        radius = 1;
	    }

	    /** Construct a circle with a specified radius */
	    SimpleCircle(double newRadius){
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


