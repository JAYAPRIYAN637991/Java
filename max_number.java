
import java.util.Scanner;

public class max_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numbers:");
        int a = scanner.nextInt();
    
        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        
        System.out.println("Enter third number:");
        int c = scanner.nextInt();

        int max = Math.max(a, Math.max(b, c));
        System.out.println("The maximum number is: " + max);
    }
    
}
