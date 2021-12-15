/*
 * Written by Evan Scales
 * CSCE 145 Exam01 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question03 {

	public static int[] array;//The array to be used in the problem
	public static void main(String[] args) {
		int number;//Used for the stairs
		if(args == null || args.length == 0)
		{
//-----------------------------------------------------------------------------------
			int[] tempArray ={2,4,6,8,10};//You may change these values to test your solution 2,4,6,8,10
//Do not alter-----------------------------------------------------------------------
			array = tempArray;
		}
		else
		{

		}
//-----------------------------------------------------------------------------------
		//Write your solution here
		int even = -1;
		int odd = -1;
		
		//bubble sort to sort array from smallest to largest
        boolean hasSwapped = true;
        while(hasSwapped){
            hasSwapped = false;
             for(int i = 0;i<array.length-1;i++){
				 if(array[i]>array[i+1]){
					int temp = array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					hasSwapped = true;
				 }
			 }
		}
		
		//starts from smallest number and moves up determining if number is odd or even
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				 even = array[i];
			}
			if(array[i]%2==1){
				 odd = array[i];
			}
		}
		
		//print max even and odd numbers
		System.out.println("Max Even: "+even);
		System.out.println("Max Odd: "+odd);	
	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * Code is used in this program to determine the max of odd and even values. If there is not max for a odd or even value then -1 is printed.
 *  Since it cant be known before if there are both even and odd numbers the variables for their maxes are set to -1 from the start. I decided
 *  to sort all the numbers in the array first to find the max numbers. Bubble sort is used, which will look at the arrays index and the one next
 *  to it to determine the larger value. The values will keep swapping until no more swaps are made, this is made with a while loop. The smallest
 *  number will be at index 0 of the array while the largest will be at the arrays length -1. To determine the largest odd and even number a for
 *  loop is used to go through every index starting with 0, the smallest. Inside the for loop 2 if statements use modular division to determine
 *  if the number is odd or even. If the number modularly divided by 2 is 0 then its even, if its equal to 1 then its odd. Since the loop starts
 *  with the smallest numbers then by the time it reaches the end the largest odd or even number will be found. After the largest odd and even numbers
 *  are found they are printed to the console.
 */