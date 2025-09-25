import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) 
        {
            System.out.println(number + " \n Yess");
        } 
        else {
            System.out.println(number + " \n Noo");
        }
    }
}