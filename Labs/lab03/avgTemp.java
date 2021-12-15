/**
 * written by Evan Scales
 */

import java.util.Scanner;
public class avgTemp {
    public static final int SIZE = 10;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the bellow average temperature tester program");
        double[] temps = new double[SIZE];
        double sum = 0.0;

        //get all the temps
        for(int i = 0;i < temps.length;i++){
            System.out.println("Enter the temp for day "+(i+1));
            temps[i] = keyboard.nextDouble();
            sum+=temps[i];
        }
        
        double avg = sum/temps.length;
        System.out.println("The average temperature for those "+temps.length+" days is "+avg+" degrees.");
        System.out.println("The days below average were");

        for(int i = 0;i<temps.length;i++){
            if(temps[i]<avg){
                System.out.println("Day "+(i+1)+" with "+temps[i]);
            }
        }


        
    }
}