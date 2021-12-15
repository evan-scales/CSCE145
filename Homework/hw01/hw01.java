/**
 * Written by Evan Scales
 */

import java.util.Scanner;
import java.util.Random;
public class hw01 {
    public static final int ROUNDS = 3;
    public static final int ROCK = 0;
    public static final int PAPER = 1;
    public static final int SCISSORS = 2;
    public static final int UPPER_LIMIT = 3;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        boolean playAgain = true;
        do{
            System.out.println("Welcome to Rock Paper Scissors! Best 2 out of 3!");

            int humanScore = 0;
            int computerScore = 0;
    
            for(int i = 0;i<ROUNDS;i++){
                System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\"");
                
                int computerInt = r.nextInt(UPPER_LIMIT);
                String humanChoice = keyboard.nextLine();
                 
                if (humanChoice.equalsIgnoreCase("rock")&&computerInt==ROCK){
                    System.out.println("Rock v Rock! Tie!");
                }
                else if (humanChoice.equalsIgnoreCase("rock")&&computerInt==PAPER){
                    System.out.println("Rock v Paper! Computer Wins!");
                    computerScore++;
                }
                else if(humanChoice.equalsIgnoreCase("rock")&&computerInt==SCISSORS){
                    System.out.println("Rock v Scissors! Player Wins!");
                    humanScore++;
                }
                else if(humanChoice.equalsIgnoreCase("paper")&&computerInt==ROCK){
                    System.out.println("Paper v Rock! Player Wins!");
                    humanScore++;
                }
                else if(humanChoice.equalsIgnoreCase("paper")&&computerInt==PAPER){
                    System.out.println("Paper v Paper! Tie!");
                }
                else if(humanChoice.equalsIgnoreCase("paper")&&computerInt==SCISSORS){
                    System.out.println("Paper v Scissors! Computer Wins!");
                    computerScore++;
                }
                else if(humanChoice.equalsIgnoreCase("scissors")&&computerInt==ROCK){
                    System.out.println("Scissors v Rock! Computer Wins!");
                    computerScore++;
                }
                else if(humanChoice.equalsIgnoreCase("scissors")&&computerInt==PAPER){
                    System.out.println("Scissors v Paper! Player Wins!");
                    humanScore++;
                }
                else if(humanChoice.equalsIgnoreCase("scissors")&&computerInt==SCISSORS){
                    System.out.println("Scissors v Scissors! Tie!");
                }
                else{
                    System.out.println("Not a valid input. Computer wins");
                    computerScore++;
                }  
                
                //print total score
                System.out.println("Player has won "+humanScore+" times and the computer has won "+computerScore+" times");
                //end game if only 2 rounds are needed
                if (humanScore == 2){
                    i = ROUNDS;
                }
                else if (computerScore == 2){
                    i = ROUNDS;
                }
            }
            //determine winner
            if(humanScore>computerScore){
                System.out.println("Player wins!");
            }
            else if (computerScore>humanScore){
                System.out.println("Computer Wins");
            }
            else{
                System.out.println("Tie!");
            }
            //see if player will play again
            System.out.println("Enter \"true\" to play again");
            playAgain = keyboard.nextBoolean();
            keyboard.nextLine();
        }while(playAgain);
    }
}