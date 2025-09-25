import java.util.Scanner;
public class larg {
    public static void main(String[] args) {
        int largest=0;
        int secondlargest=0;
        int count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int size = s.nextInt();
        int arr[]=new int[size];
     System.out.println("Enter the elements:");
     for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
     }
     
    for(int i = 0; i<arr.length; i++){
       if(arr[i] > largest){
        largest = arr[i];
        secondlargest = largest;
       }
       else if(arr[i] > secondlargest && arr[i] != largest){
        secondlargest = arr[i];
       }
    }
}
}