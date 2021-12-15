/*
 * CSCE 145 Exam02 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 */
//Do not alter-----------------------------------------------------------------------
public class Question02 {

	public static void main(String[] args) 
	{
		//Check for Syntax errors in this file		
		//Question 02 Tests
		//Construct it with the default constructor
		System.out.println("Constructing 2 instances of Pizza using the Default Constructor");
		Pizza p = new Pizza();
		Pizza p2 = new Pizza();
		//Testing toString Method
		System.out.println("Testing the toString Method");
		System.out.println(p);
		//Testing Equals method
		System.out.println("Testing Equals Method with 2 Pizzas that have the same properties");
		System.out.println("Are they equal? "+p.equals(p2));
		System.out.println("Setting values of Pizza 2 to have different values.\nTesting Equals Method with 2 Pizzas that have different properties");
		p2.setLocation("ASDF");
		p2.setNumberOfToppings(12);
		p2.setPrice(10.00);
		System.out.println("Are they equal? "+p.equals(p2));
		System.out.println("Setting values of Pizza 2 to null.\nTesting Equals Method with 2 Pizzas where one is null");
		p2 = null;
		System.out.println("Are they equal? "+p.equals(p2));
		//Testing Cost Per Slice Method
		System.out.println("Setting the cost of Pizza 1 to 16.00 and creating a new Pizza 2 with cost 8.00\nTesting Cost per Slice with Pizza 1 and Pizza 2 for 8 slices");
		p.setPrice(16.00);
		p2 = new Pizza("Pizza 2",12, 8.00);
		System.out.println("Price per 8 slices for Pizza 1: "+p.costPerSlice(8));
		System.out.println("Price per 8 slices for Pizza 2: "+p2.costPerSlice(8));
		System.out.println("Testing Cost per Slice with Pizza 1 and Pizza 2 for 0 slices");
		System.out.println("Price per 0 slices for Pizza 1: "+p.costPerSlice(0));
		//Testing Least Expensive method
		System.out.println("Testing Least Expensive Method with Pizza 1 and Pizza 2");
		System.out.println(Pizza.leastExpensive(p, p2));
		System.out.println("Testing Least Expensive Method with Pizza 1 and null");
		System.out.println(Pizza.leastExpensive(p, null));
		System.out.println("Testing Least Expensive Method with null and null");
		System.out.println(Pizza.leastExpensive(null, null));
	}

}
//-----------------------------------------------------------------------------------
