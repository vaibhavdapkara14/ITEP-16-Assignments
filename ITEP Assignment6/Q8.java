import java.util.Scanner;
class Program8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        int arr[] = new int[size+1];

        for(int i=0; i<size; i++){
            System.out.print("Enter " + (i+1) + " value : ");
            arr[i] = sc.nextInt();
        } 

        System.out.print("\nEnter Inserting Number: ");
        int Insert = sc.nextInt();

        System.out.print("\nEnter Which position to insert: ");
        int position = sc.nextInt();

        for(int i = size; i>=position-1; i--){
            arr[i] = arr[i-1];
        }
        arr[position-1] = Insert;
        
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }

    }
}