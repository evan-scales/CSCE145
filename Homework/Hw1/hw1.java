/**
 * written by evan scales
 */

 import java.util.Scanner;
public class hw1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You have been recently diagnosed with lung cancer. With your job as a teacher there is no way you will be able to pay your medical bills. Luckily a dear friend of yours offers to pay your bills. Will you take it? Enter \"Yes\" or \"No\".");

        String takeMoney = keyboard.nextLine();

        //og if statement
        if (takeMoney.equalsIgnoreCase("yes")){
            System.out.println("You really did not want to take their money but feel as if their is no other option. You feel guilty about it and wish to pay them back. Will you cook meth to pay them back, find a legal way to pay them back, don't pay them back and cook meth, or do nothing? Enter \"Both\", \"Pay\", \"Cook\", or \"Nothing\".");
            String cookMeth1 = keyboard.nextLine();
            if(cookMeth1.equalsIgnoreCase("both")){
                //ending1 going to jail
                System.out.println("With the stress of making your drug money seem legal to pay back your friend you start making mistakes. You are tired and try selling meth to a cop. You're arrested and spend 6 months in jail until the cancer finally kills you.");

            }
            else if(cookMeth1.equalsIgnoreCase("pay")){
                //ending2 commit suicide
                System.out.println("Wanting to pay back your friend with legal money is harder than it seems. You are unable to find means and feel as if you are a failure. You start drinking a lot, spending over $300 a day on booze. You're even drinking on the way to work when one day you swerve off a bridge and die.");

            }
            else if(cookMeth1.equalsIgnoreCase("cook")){
                System.out.println("When selling meth in bulk to Tuco he shorts you $10,000. Maybe it was an accident, maybe not? Will you ask for it back, murder him, or do nothing about it. Enter \"Ask\", \"Murder\", or \"Nothing\".");
                String short10 = keyboard.nextLine();
                if(short10.equalsIgnoreCase("ask")){
                    //ending3 leave some money to family when dead
                    System.out.println("After asking for the money Tuco hands you the $10,000. You keep on dealing with Tuco until you eventually die from cancer leaving your family some money.");

                }
                else if(short10.equalsIgnoreCase("murder")){
                    //ending4 die from cancer leave good money to family
                    System.out.println("You're mad and want revenge. Next meeting you pull out a glock and shoot Tuco and his guards. With no one else to deal meth in the are you take over his drug empire. However, your cancer catches up to you and you die. Since you owned a drug empire your family is left with 80 million dollars. You did great.");

                }
                else if(short10.equalsIgnoreCase("nothing")){
                    //ending5 get murdered leave no money to family
                    System.out.println("Tuco senses your weakness and at the next meeting decides to kidnap you. He tortues you for the location of your drug money, then kills you. At least your family does not have to pay your medical bills.");

                }

            }
            else if(cookMeth1.equalsIgnoreCase("nothing")){
                //ending6 teacher die
                System.out.println("Living a boring life of a chemistry your cancer catches up and kills you. The only good thing is your family does not have to pay your medical bills.");

            }


        }
        else if(takeMoney.equalsIgnoreCase("no")){
            System.out.println("Living as a high school teacher can be pretty boring. Your DEA borther-in-law asks you to go on a ride along. Will you do it? Enter \"Yes\", or \"No\".");
            String rideAlong = keyboard.nextLine();
            if(rideAlong.equalsIgnoreCase("yes")){
                System.out.println("When doing the ride along you see how much money a small meth lab operation can make. You start thinking and wonder if you can do it to pay your medical bills. Will you do it? Enter \"Yes\" or \"No\".");
                String cookMeth2 = keyboard.nextLine();
                if(cookMeth2.equalsIgnoreCase("yes")){
                    System.out.println("While cooking your first batch you forget how many grams of sulfuric acid you need to use. You remember it's less than 10. Enter how many grams you will use.");
                    Integer chemicals = keyboard.nextInt();
                    if (chemicals==3){
                        System.out.println("You sigh with relief since you remembered correctly. With a good system going on you need to decide how many more batches to cook, you don't want to do too many in case you get caught, but also don't want to do too little so you can leave your family money. How many batches will you cook?");
                        Integer batches = keyboard.nextInt();
                        if(batches>20){
                            //ending7 too much to handle
                            System.out.println("You keep on cooking but gain too many enemies. One of them snitches on you and you get arrested. Within 6 months of jail your cancer kills you and your family is left with your medical bills to pay for.");

                        }
                        else if(batches>=10 && batches<=20){
                            //ending8 perfect ammiunt
                            System.out.println("After cooking "+batches+" batches your cancer catches up to you and kills you. Good thing that you found out a way to leave your drug money to your family. They never knew what you were doing the entire time.");

                        }
                        else if(batches<10){
                            //ending9 too little
                            System.out.println("You cook "+batches+" batches but it is not enough to pay back your medical bills. Your cancer catches up and kills you, but sadly your family still has to pay your medical bills and you left them no money.");

                        }

                    }
                    else{
                        //ending10 blow up and die
                        System.out.println("You choose the wrong ammount then BOOM. The RV you were cooking in just exploded and you are dead.");

                    }

                }
                else if(cookMeth2.equalsIgnoreCase("no")){
                    //ending11 die cant pay back bills
                    System.out.println("You go back to work and continue teaching until the cancer kills you. You never paid your medical bills leaving your family in massiv debt.");
                }


            }
            else if(rideAlong.equalsIgnoreCase("no")){
                System.out.println("You feel bored in life and need money to pay your medical bills. With your background in chemistry you decide to start cooking meth. The only problem is getting the methylamine. Will you decide to steal some from a lab, or pay someone to steal it? Enter \"Steal\" or \"Pay\".");
                String steal = keyboard.nextLine();
                if(steal.equalsIgnoreCase("steal")){
                    System.out.println("You decide to steal the methylamine from a lab and need to figure out how long to turn their alarm off for. If it's off for too long then the guards will get suspicious, off for too litle will you have enough time? Enter how many seconds you will turn the alarm off for.");
                    Integer time = keyboard.nextInt();
                    if(time>=60 && time<=90){
                        //ending12 perfect time get methylamine and leave money for family
                        System.out.println("You break in and find the methylamine. Within "+time+" seconds you are in and out. You cook until you run out of methylamine, by the time you're out the cancer catches up to you and you die. Good thing you found a way to leave your drug money to your family.");

                    }
                    else if(time>90){
                        //ending13 too much time guards are alerted
                        System.out.println("You break in and find the methylamine, you get out but as you leave the guards notice the alarm has been off for more than 90 seconds. They start looking around the lab and see you outside running off with their methylamine. They arrest you and end up in jail. While in jail your cancer catches up to you and you die. Your family is in a great ammount of debt.");

                    }
                    else if(time<60){
                        //ending14 alarm goes off while stealing methylamine
                        System.out.println("You break in and locate the methylamine. After locating it you start going towards the exit but the alarm turns on and the guards find you. They arrest you and send you to jail. While in jail your cancer catches up and you die leaving your family in a great ammount of debt.");

                    }

                }
                else if(steal.equalsIgnoreCase("pay")){
                    System.out.println("You find 2 people who offer to buy the methylamine for you. Will you choose Bladimir or Ben? Enter \"Bladimir\" or \"Ben\".");
                    String person = keyboard.nextLine();
                    if(person.equalsIgnoreCase("bladimir")){
                        //ending15 sells you methylamine die and leave good money for family
                        System.out.println("Bladimir sells you the methylamine. You cook until you run out of methylamine, by the time you're out the cancer catches up to you and you die. Good thing you found a way to leave your drug money to your family. ");

                    }
                    else if(person.equalsIgnoreCase("ben")){
                        //ending16 undercover cop go to jail
                        System.out.println("Ben turns out to be an undercover cop. He arrests you and send you to jail. While in jail your cancer catches up and you die leaving your family in a great ammount of debt. ");

                    }
                }
            }
        }
    }
}