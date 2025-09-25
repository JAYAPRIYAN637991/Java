
import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } 
        else if (number < 0) 
        {
            System.out.println(number + " is a negative number.");
        } 
        else 
        {
            System.out.println("The number is zero.");
        }
    }
}
