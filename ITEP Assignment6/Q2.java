import java.util.Scanner;
class Program2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        System.out.print("How much Index you store in array : ");
        int n  = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter " + (i+1) + " value of Index : ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
     
        System.out.println("\nThe value of all Index is : ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("\nTotal sum of all the Index value is : "+sum);
    }
}