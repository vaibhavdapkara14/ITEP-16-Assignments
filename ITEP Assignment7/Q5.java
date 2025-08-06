import java.util.Scanner;

class Program5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,5,3,7,4,6};
         int n =arr.length;
         for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
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
        
        System.out.print("\nEnter k th Smallest value : ");
        int sk = sc.nextInt();

        System.out.print("\nEnter k th Largest value : ");
        int lk = sc.nextInt();

        System.out.println(arr[sk-1] + " is the " + sk + " smallest value");
        System.out.println(arr[n-lk] + " is the " + lk +  " Largest value");
    }
}