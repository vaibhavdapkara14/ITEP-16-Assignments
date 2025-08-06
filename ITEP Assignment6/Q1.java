import java.util.Scanner;
class Program1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        System.out.print("How much Index you store in array : ");
        int n  = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter " + (i+1) + " value of Index : ");
            arr[i] = sc.nextInt();
        }
     
        System.out.println("The value of all Indes is : ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}