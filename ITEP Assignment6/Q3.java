import java.util.Scanner;

class Program3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       System.out.print("How much Index you want : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int evensum = 0;
        int oddsum = 0;

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the value of "+arr[i]+" index : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if((arr[i]%2) == 0){
                evensum = evensum + arr[i];
            }
            else{
                oddsum = oddsum+arr[i];
            }
        }
        System.out.println("\nTotal even number sum is: "+ evensum);
        System.out.println("\nTotal odd number sum is : "+ oddsum);

    }
}