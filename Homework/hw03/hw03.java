/**
 * written by evan scales
 */
import java.util.Scanner;
public class hw03 {
    public static final int SIZE = 10;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double[] priceArray = new double[SIZE];
        String[] nameArray = new String[SIZE];

        System.out.println("Welcome to the taco price sorter! Enter 10 taco names and prices and I'll sort it!");

        //loop to get tacos names and prices
        for(int i = 0;i<SIZE;i++){
            System.out.println("Enter the name of taco "+(i+1));
            nameArray[i] = keyboard.nextLine();
            System.out.println("Enter taco's price");
            priceArray[i] = keyboard.nextDouble();
            keyboard.nextLine();
        }

        //sort taco prices
        boolean hasSwapped = true;
        while(hasSwapped){
            hasSwapped = false;
            for(int i = 0;i<SIZE-1;i++){
                if(priceArray[i]>priceArray[i+1]){
                    hasSwapped = true;
                    double dTemp = priceArray[i];
                    String sTemp = nameArray[i];

                    priceArray[i]=priceArray[i+1];
                    nameArray[i]=nameArray[i+1];

                    nameArray[i+1]=sTemp;
                    priceArray[i+1]=dTemp;
                }
            }
        }

        //print tacos and their prices
        System.out.println("Sorted Tacos are");
        for(int i =0;i<SIZE;i++){
            System.out.println("Taco prices "+nameArray[i]+" taco "+priceArray[i]);
        }
    }
}