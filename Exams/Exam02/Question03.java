/*
 * written by Evan Scales
 * CSCE 145 Exam02 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class Question03 {

	//The array of boxes to be used by the method "getAverageWeight()"
	//This property is public for testing purposes
	public Box[] boxes;
	
	public double getAverageWeight()
	{
//-----------------------------------------------------------------------------------
		double sum = 0.0;
		int count = 0;
		for(int i = 0;i<boxes.length;i++){
			if(boxes[i] != null){
				count++;
				sum+= boxes[i].getWeight();
			}
		}
		if(count > 0)
			return sum/count;
		else 
			return 0.0;


	}//Do not alter
	//Write any additional helper properties or methods here
	
	//--------------------------------------------------------------------------------
//Do not alter-----------------------------------------------------------------------
	public static void main(String[] args) {
		Box[] boxArray = new Box[10];
		boxArray[0] = null;
		boxArray[1] = null;
		boxArray[2] = new Box("Box02",10.0);
		boxArray[3] = new Box("Box03",20.0);
		boxArray[4] = null;
		boxArray[5] = new Box("Box05",40.0);
		boxArray[6] = null;
		boxArray[7] = new Box("Box07",50.0);
		boxArray[8] = null;
		boxArray[9] = new Box("Box09",5.0);
		Question03 q3 = new Question03();
		q3.boxes = boxArray;
		System.out.println("Testing the getAverageWeight method");
		System.out.println("The average box weight is: "+q3.getAverageWeight());
		System.out.println("Resetting some of the Boxes.");
		boxArray[0] = new Box("Box00",5.0);
		boxArray[4] = new Box("Box04",10.0);
		boxArray[8] = new Box("Box08",20.0);
		System.out.println("The average box weight is: "+q3.getAverageWeight());
		System.out.println("Testing getAverageWeight method with an empty Array");
		boxArray = new Box[10];
		q3.boxes = boxArray;
		System.out.println("The average box weight is: "+q3.getAverageWeight());
	}

}
//-----------------------------------------------------------------------------------
/*Solution Description
 * In question 3 we find the average weight of boxes from an array. In the class
 *  Box it has a parameterized constructor that checks the inputs to make the instance 
 * of the class. It also has 2 methods that will get the label and get the weight. In
 *  the class with the main method it constructs the array then starts a method called getAverageWeight. 
 * To get the average weight 2 variables called sum and count are made then a for loop is made that will go through
 *  every item in the box array. As the for loop runs it check if each box is null, if that box is not null 
 * then one is added to count and the weight of the box at i is added to the sum. Then at the end if the count is 
 * greater than 0 then it returns the sum divided by the count to find the average weight of the boxes. If count is 0 then it returns 0. 
 */