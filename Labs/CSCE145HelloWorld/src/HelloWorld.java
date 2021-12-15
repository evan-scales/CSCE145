/*
 * Written By Evan Scales
 * CSCE145 Hello World
 * */
import java.util.Scanner;
public class HelloWorld {
	
	//Main Method
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		System.out.println("WHat is your name?");
		
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		System.out.println("Greetings "+name+("!"));
		
		System.out.println("How many cats do you have?");
		int numberOfCats = keyboard.nextInt();
		System.out.println("How does one live with only "+numberOfCats+(" cats?"));
		
	}

}
