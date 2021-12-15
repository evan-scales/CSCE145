/*
 * CSCE 145 Exam02 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 */
//Do not alter-----------------------------------------------------------------------
public class Question01 {

	public static void main(String[] args) 
	{
		//Check for Syntax errors in this file
		
		//Question 01 Tests
		//Declare a new instance of a Pizza
		Pizza p;
		//Construct it with the default constructor
		System.out.println("Constructing a new instance of Pizza using the Default Constructor");
		p = new Pizza();
		//Testing Accessors
		System.out.println("Testing Accessors");
		System.out.println("Location: "+p.getLocation());
		System.out.println("Number of Toppings: "+p.getNumberOfToppings());
		System.out.println("Price: "+p.getPrice());
		//Testing Mutators
		System.out.println("Testing Mutators with Correct Values");
		p.setLocation("ASDF");
		p.setNumberOfToppings(10);
		p.setPrice(14.99);
		System.out.println("Location: "+p.getLocation());
		System.out.println("Number of Toppings: "+p.getNumberOfToppings());
		System.out.println("Price: "+p.getPrice());
		System.out.println("Testing Mutators with Incorrect Values");
		p.setLocation(null);
		p.setNumberOfToppings(-10);
		p.setPrice(-14.99);
		System.out.println("Location: "+p.getLocation());
		System.out.println("Number of Toppings: "+p.getNumberOfToppings());
		System.out.println("Price: "+p.getPrice());
		//Creating another instance of a Pizza using the Param constructor
		System.out.println("Constructing a new instance of Pizza using the Param Constructor");
		Pizza p2 = new Pizza("ASDF2",15,21.00);
		System.out.println("Location: "+p2.getLocation());
		System.out.println("Number of Toppings: "+p2.getNumberOfToppings());
		System.out.println("Price: "+p2.getPrice());
	}
}
//-----------------------------------------------------------------------------------
