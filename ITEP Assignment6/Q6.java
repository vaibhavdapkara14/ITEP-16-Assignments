import java.util.Scanner;

class Program6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       System.out.print("size of array  ");
        int n = sc.nextInt();
        int arr[] = new int[n];
       

        for(int i=0; i<n; i++){
            System.out.print("Enter the value of "+(i+1)+" element : ");
            arr[i] = sc.nextInt();
        }

       for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];      
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
       }
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}