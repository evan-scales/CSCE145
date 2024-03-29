/*
*Written by Evan Scales
*/ 
import java.util.Scanner;
public class DateAndTimeTester {

    public void run(){
        Scanner keyboard = new Scanner(System.in);
        while(true){
            System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
            String input = keyboard.nextLine();
            System.out.println("The date and time "+(isValid(input)?"is valid!":"is not valid"));
            System.out.println("Would you like to exit? Tye \"Quit\" to exit or press [ENTER] to continue");
            input = keyboard.nextLine();
            if(input.equalsIgnoreCase("quit"))
                break;
            
        }
        System.out.println("Goodbye");
    }
    public boolean isValid(String dateAndTime){
        return isValidDate(dateAndTime) && isValidTime(dateAndTime);
    }
    public boolean isValidDate(String date){
        int month = getMonth(date);
        int day = getDay(date);
        if(day <= 0|| month <= 0 || month > 12)
            return false;
        if(month == 4 || month == 6 || month == 9 || month == 11){
            if (day<= 30){
                return true;
            }
            else{
                return false;
            }
        }
        else if(month == 2 ){
            if(day <= 28){
                return true;
            }
            else{
                return false;
            }
        }
        else if(day <= 31){
            return true;
        }
        else{
            return false;
        }

        
    }
    public boolean isValidTime(String time){
        int hour = getHour(time);
        int minute = getMinute(time);
        if(hour <= 0 || minute < 0){
            return false;
        }
        else if(hour>12){
            return false;
        }
        else if (minute > 59){
            return false;
        }
        return true;
    }
    //MM/DD HH:MM
    public int getMonth(String date){
        int index = date.indexOf("/");
        String month = date.substring(0, index);
        return Integer.parseInt(month);
    }
    public int getDay(String date){
        int startIndex = date.indexOf("/")+1;
        int endIndex = date.indexOf(" ");
        String day = date.substring(startIndex, endIndex);
        return Integer.parseInt(day);
    }
    public int getHour(String time){
        int startIndex = time.indexOf(" ")+1;
        int endIndex = time.indexOf(":");
        String hour = time.substring(startIndex, endIndex);
        return Integer.parseInt(hour);
    }
    public int getMinute(String time){
        int index = time.indexOf(":")+1;
        String miniute = time.substring(index);
        return Integer.parseInt(miniute);
    }


}