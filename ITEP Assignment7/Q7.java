import java.util.Scanner;

class Program7{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        System.out.print("Enter " + (i+1 )+ " value : ");
        arr[i] = sc.nextInt();
    }

    System.out.print("\n Enter the Target: ");
    int target = sc.nextInt();
 
     int sum = 0;
     int x = 0;
      for(int i=0; i<n; i++){
        if(sum == target){
            System.out.print("\nSubarray of Total sum " + target + " is from position " + (x+1) +" to " + i    );
            break;
        }
        sum += arr[i];

        if(sum > target){
            sum = sum - arr[x];
            x++;
        }
      }
   } 
} 