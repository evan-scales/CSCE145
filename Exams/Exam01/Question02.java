/*
 * Written by Evan Scales
 * CSCE 145 Exam01 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question02 {

	public static void main(String[] args) {
		Scanner keyboard;
		if(args == null || args.length == 0)
		{
			keyboard = new Scanner(System.in);
			System.out.println("Welcome to the Echo Program! I'll echo whatever is said until you enter \"quit\"");
		}
		else
		{
			keyboard = new Scanner(args[0]);
		}
//-----------------------------------------------------------------------------------
		//Write your solution here
		//loop repeats until quit is entered
		boolean quit = true;
		do{
            String input = keyboard.nextLine();

            if(input.equalsIgnoreCase("quit")){
                System.out.println("Goodbye");
                quit = false;
            }
            else{
                System.out.println("Echo: "+input);
            }
        }while(quit);
		System.exit(0);		
	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * In this program the console will echo whatever the user inputs. Since the echo will continue
 *  until the user types “quit” a do while loop is used. The do while loop is best for this because
 *  the Boolean statement is checked after the code is ran. A Boolean named quit is set to true to
 *  be used in the do while loop. The loop will continue running until quit is set to false. Inside
 *  the loop we get the users input. If that input is equal to “quit” then Goodbye is printed in the 
 * console and the variable quit is set to false. The loop will be stopped, and the code will read whatever 
 * is after the loop. After the loop System.Exit(0); is there to stop the program. After that if statement
 * checking if the user input “quit” is an else statement. That will catch any other input. That else 
 * statement is there to echo the users input. The console will output “Echo: “ and whatever the user inputted.
 */