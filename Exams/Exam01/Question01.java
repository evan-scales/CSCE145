/*
 * Written by Evan Scales
 * CSCE 145 Exam01 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question01 {

	public static void main(String[] args) {
		int number;//Used for the stairs
		if(args == null || args.length == 0)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the value to draw some stairs");
			number = keyboard.nextInt();
			keyboard.nextLine();
		}
		else
		{
			number = Integer.parseInt(args[0]);
		}
//-----------------------------------------------------------------------------------
		//Write your solution here
        if(number<=0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        //first set of stairs
        for(int i = 0;i<number;i++){
            for(int j = 0;j<number;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second set of stairs
        for(int i = 0;i<number+1;i++){
            for(int j = 0;j<number+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //third set of stairs
        for(int i = 0;i<number+2;i++){
            for(int j = 0;j<number+2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * To build the set of stairs we first get the input from the user and declare it as a variable named number. If that number is 
 * less than or equal to 0 then the program stops right away. To build the first set of stairs we use a for loop that counts up to 
 * the variable number. Inside that for loop there is another for loop that also counts up to number. In the second for loop the asterisks 
 * are printed until the variable j reaches number. The program then jumps to the outer for loop to print the next line. The inner for loop is used to form the 
 * length of the staircase, and the outer for loop is used to form the width of the staircase. This repeats to form a rectangle for the first set
 * of stairs. To build the second and third set of stairs the process is similar. The only thing that changes is for the second set of stairs 1 is 
 * added to number, to add to the length and width of it. Then for the third staircase you add 2 to number to increase the length and width.
 * 
 * 
 */