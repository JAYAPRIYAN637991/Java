import java.util.Scanner;
class demo{
    public static void main(String[] args) {
        int count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int size = s.nextInt();
        int arr[]=new int[size];
     System.out.println("Enter the elements:");
     for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
     }
    for(int num:arr){
        if(num>1){
            boolean isPrime =true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
    }
    System.out.println("The total number of prime number in the array :"+count);
    }
}

