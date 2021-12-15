/**
 * Written by Evan Scales
 */

import java.util.Scanner;
import java.util.Random;
public class lab02 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter the number a dice should be rolled");
        int rolls = keyboard.nextInt();

        //stop program if a real number is not entered
        if(rolls<=0){
            System.out.println("Not a valid number.");
            System.exit(0);
        }

        //varibles for sides of dice
        int ones, twos, threes, fours, fives, sixes;
        ones = twos = threes = fours = fives = sixes = 0;

        int count = 0;

        while(count<rolls)
        {
            int number = r.nextInt(6)+1;
            count++;
            System.out.println(number+ " was rolled");

            //if statements
            if(number ==1){
                ones++;
            }
            else if(number==2){
                twos++;
            }
            else if(number==3){
                threes++;
            }
            else if(number==4){
                fours++;
            }
            else if(number==5){
                fives++;
            }
            else{
                sixes++;
            }

        }

        //print how many times a number was rolled
        System.out.println("One: "+ones+"\nTwo: "+twos+"\nThree "+threes+"\nFour: "+fours+"\nFive: "+fives+"\nSix: "+sixes);

        
    }
}