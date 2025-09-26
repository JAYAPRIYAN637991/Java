import java.util.Scanner;

public class MileageRemuneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double start = sc.nextDouble();
        double end = sc.nextDouble();


        double distance = end - start;
        double remuneration = distance * 25;

        System.out.printf("%.2f %.2f", distance, remuneration);

        sc.close();
    }
}
