import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the Number Frequencies:");
        int freq = sc.nextInt();
        int count = 0;
        for (int i = 0 ;i < size; i++) {
            if (arr[i] == freq) {
                count++;
            }
            
        }
        System.out.println("The Frequency of " + freq + " is: " + count);
    
}
}