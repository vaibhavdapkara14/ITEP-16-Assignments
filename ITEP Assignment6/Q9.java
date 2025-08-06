import java.util.Scanner;
class Program9{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter " + (i+1) + " value: ");
            arr[i] = sc.nextInt();
        }

        // System.out.print("\nEnter delete element: ");
        // int delete = sc.nextInt();

        System.out.print("\nEnter Which position to delete: ");
        int position = sc.nextInt();

        for(int i=position-1; i<size-1; i++){
            arr[i] = arr[i+1];
        }

        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
        }
    }
}