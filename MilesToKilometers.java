import java.util.Scanner;

public class MilesToKilometers{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
       
        double miles = input.nextDouble();
        double kilos = miles * 1.6;

        System.out.printf("%.0f miles is %.1f kilometers", miles, kilos);
    }
}