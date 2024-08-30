import java.util.Scanner;

public class ConvertMinutesToYearsAndDays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
    
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        final int DAYS_IN_YEAR = 365;
        
        //Calculate total day(s)
        long totalDays = minutes / (MINUTES_IN_HOUR * HOURS_IN_DAY);
        
        //Calculate year(s) and remaining day(s)
        long years = totalDays / DAYS_IN_YEAR;
        long remainingDays = totalDays % DAYS_IN_YEAR;
        
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
    }
}
