import java.util.Scanner;
public class min_max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scanner.nextInt();
         
         System.out.println("Enter b number");
        int b = scanner.nextInt();
       
        int min = Math.min(a, b);
        int max = Math.max(a, b);   
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
