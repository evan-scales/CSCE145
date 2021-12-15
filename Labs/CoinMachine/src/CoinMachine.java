/**
 * 
 * Written by Evan Scales
 */

 import java.util.Scanner;

public class CoinMachine {
	public static final int QTR = 25;
	public static final int NICKLE = 5;
	public static final int DIME = 10;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a whole number from 1 to 99. The machine will determine a combination of coins");

		int val = keyboard.nextInt();
		int valCopy = val;

		int qtr = valCopy/QTR;
		valCopy %= QTR;

		int dime = valCopy/DIME;
		valCopy %= DIME;

		int nick = valCopy/NICKLE;
		valCopy %= NICKLE;

		int pen = valCopy;

		System.out.println(val+" cents in coins:\n"+qtr+" Quarters\n"+dime+ " Dimes\n"+nick+" Nickels\n"+pen+" Pennies");
	}
}