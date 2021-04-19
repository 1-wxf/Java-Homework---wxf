package homework5;

public class program9_7TestCircleWithStaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The numbers of Circle objects is " + 
				program9_6CircleWithStaticMember.numberOfObjects);
	
		// Create C1
		program9_6CircleWithStaticMember c1 = new program9_6CircleWithStaticMember();
		
		//Display c1 BEFORE c2 is created
		System.out.println("After creating c1");
		System.out.println("c1: radius (" + c1.radius +
		  ") and numbers of Circle objects (" +
		  c1.numberOfObjects + ")");
		
		// Create c2
		program9_6CircleWithStaticMember c2 = new program9_6CircleWithStaticMember(5);
		
		// Modify c1
		c1.radius = 9;
		
		// Display c1 and c2 AFTER c2 was created
		System.out.println("After creating c2 and modifying c1");
		System.out.println("c1:radius (" + c1.radius +
		  ") and number of Circle objects (" +
	      c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + 
		  ") number of Circle objects (" +
		  c2.numberOfObjects + ")");

	}

}
