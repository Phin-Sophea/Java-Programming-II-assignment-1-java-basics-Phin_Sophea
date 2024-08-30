import java.util.Scanner;

public class MultiplyNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
    
        int result = (number == 0) ? 0 :
            ((number % 10) * (number / 10 % 10) * (number / 100 % 10));
        
        System.out.println("The multiplication of all digits in " + number + " is " + result);
    }
}
