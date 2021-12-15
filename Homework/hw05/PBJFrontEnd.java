/**
 * written by Evan Scales
 */
import java.util.Scanner;
public class PBJFrontEnd {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        PBJSandwich[] pbj = {new PBJSandwich(), new PBJSandwich()};


        String aN;
        int aC;
        String aT;
        boolean aI;

        System.out.println("Welcome to the PBJ Sanwich Maker!");

        for(int i=0;i<2;i++){
            System.out.println("Sandwich "+(i+1)+"\nTop Slice of Bread Information\nEnter the name of bread");
            aN = keyboard.nextLine();
            System.out.println("Enter the number of calories");
            aC = Integer.parseInt(keyboard.nextLine());
            System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\",\"Whole Grain\", or \"Whole Wheat\"");
            aT = keyboard.nextLine();
            pbj[i].setTop(aN, aT, aC);

            System.out.println("Peanut butter information\nEnter the name of peanut butter");
            aN=keyboard.nextLine();
            System.out.println("Enter the number of calories");
            aC = Integer.parseInt(keyboard.nextLine());
            System.out.println("Is it crunchy? Enter \"true\", or \"false\"");
            aT = keyboard.nextLine();
            if(aT.equalsIgnoreCase("true"))
                aI = true;
            else    
                aI = false;
            pbj[i].setButter(aN, aI, aC);

            System.out.println("Jelly information\nEnter the name of the jelly");
            aN = keyboard.nextLine();
            System.out.println("Enter the number of calories");
            aC = Integer.parseInt(keyboard.nextLine());
            System.out.println("Enter the type of jelly. Must be \"Apple\", \"Blueberry\",\"Grape\", \"Strawberry\", \"Tomato\"");
            aT = keyboard.nextLine();
            pbj[i].setJelly(aN, aT, aC);

            System.out.println("Bottom slice of bread information\nEnter the name of bread");
            aN = keyboard.nextLine();
            System.out.println("Enter the number of calories");
            aC = Integer.parseInt(keyboard.nextLine());
            System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\",\"Whole Grain\", or \"Whole Wheat\"");
            aT = keyboard.nextLine();
            pbj[i].setBottom(aN, aT, aC);
        }

        for(int i=0;i<2;i++){
            System.out.println("Sandwich "+(i+1));
            System.out.println(pbj[i].toString());
            System.out.println("");
        }

        System.out.println("Are they the same? "+pbj[0].equals(pbj[1]));
        
    }
}