import java.util.Scanner;

class Program5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       System.out.print("How much Index you want : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
       

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter the value of "+(i+1)+" index : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
           if(arr[i]%5 == 0){
            arr[i] = 0;
            System.out.println(arr[i]);
           } 
           else{
            System.out.println(arr[i]);
           }
        }
      

    }
}