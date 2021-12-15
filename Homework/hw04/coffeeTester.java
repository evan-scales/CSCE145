/**
 * written by Evan Scales
 */
import java.util.Scanner;
public class coffeeTester {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        coffee coffee01 = new coffee();
        coffee coffee02 = new coffee();

        //first coffee
        System.out.println("Let’s Coffee!!!1!11!!ONE!!!1!\nWhat’s the name of the first coffee?");
        String name1 = keyboard.nextLine();
        coffee01.setName(name1);
        System.out.println("What’s the caffeine content?");
        int caffeine1 = keyboard.nextInt();
        coffee01.setCaffeineContent(caffeine1);
        keyboard.nextLine();

        //second coffee.
        System.out.println("What’s the name of the second coffee?");
        String name2 = keyboard.nextLine();
        coffee02.setName(name2);
        System.out.println("What’s the caffeine content?");
        int caffeine2 = keyboard.nextInt();
        coffee02.setCaffeineContent(caffeine2);

        //print results
        System.out.println(coffee01);
        System.out.println(coffee02);        
    }
}