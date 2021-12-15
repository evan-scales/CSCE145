/*
 * Written by Evan Scales
 * CSCE 145 Exam01 Question04
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question04 {

	public static double[] array;//The array to be used in the problem
	public static void main(String[] args) {
		int number;//Used for the stairs
		if(args == null || args.length == 0)
		{
//-----------------------------------------------------------------------------------
			double[] tempArray ={2.0,-4.0,-6.0,8.0,11.0};//You may change these values to test your solution
//Do not alter-----------------------------------------------------------------------
			array = tempArray;
		}
		else
		{

		}
//-----------------------------------------------------------------------------------
		//Write your solution here

        double sum = 0.0;
        int count = 0;
        double average = 0;
        //add up all numbers from array
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                sum+=array[i];
                count++;
            }
        }
        if(sum>0){
             average = sum/count;
        }
        
        System.out.println("Average: "+average);
		
	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * In this program we find the average number of all positive doubles in an array. First thing to do is
 *  to find the sum of all the positive doubles. A variable called sum is declared and set at 0.0. That
 *  is because the sum could be nothing at all if all the numbers are negative, and you don’t want the sum
 *  to be null. Count is another variable declared, which will later be used to divide the sum. Usually to
 *  find the average you would divide by the arrays length but if a number is negative that would give the wrong
 *  output. A for loop is used to go through every index in the array. If the number at the index is greater than
 *  0 then that number is added to the sum variable and count goes up by 1. After that if sum is greater than 0 then
 *  sum is divided by the count to find the average. Sum could be 0 if all the numbers in the array are negative, which
 *  is why sum is checked if its above 0. After all that then the average is printed to the console.
 */