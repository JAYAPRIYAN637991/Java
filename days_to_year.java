
import java.util.Scanner;

public class days_to_year {
    public static void main(String[] args) {
        int days;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        days = scanner.nextInt();
        
        int years = days / 365;
        int remainingDays = days % 365;

        System.out.println(days + " days " + years + " years " + remainingDays + " days.");
    }
}
