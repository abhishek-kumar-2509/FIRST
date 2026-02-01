// Develop a program where user will enter day name and you have to print number of day Like sunday - 1?

import java.util.Scanner;
public class DayNum {
    public static void main(String[] a){
        Scanner abc = new Scanner (System.in);
        
        System.out.print("Enter Any Day: ");
        String Day = abc.next().toLowerCase();

        switch(Day){
            case "sunday":
                System.out.println("sunday is 1 number");
                break;
            case "monday":
                System.out.println("monday is 2 number");
                break;
            case "tuesday":
                System.out.println("tuesday is 3 number");
                break;
            case "wednesday":
                System.out.println("wednesday is 4 number");
                break;
            case "thursday":
                System.out.println("thursday is 5 number");
                break;
            case "friday":
                System.out.println("friday is 6 number");
                break;
            case "saturday":
                System.out.println("saturday is 7 number");
                break;

            default: System.out.println("Invalid Day!");
        }
        abc.close();
    }
}
