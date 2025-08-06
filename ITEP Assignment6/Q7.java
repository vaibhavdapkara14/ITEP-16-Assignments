import java.util.Scanner;
class Program7{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60,70,80,90};

        System.out.print("Enter Finding Element: ");
        int find = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while(start <= end){
         int mid = (start+end)/2;

         if(arr[mid] == find){
            System.out.println("Element found at position: " + mid);
            found = true;
            break;
         }

         else if(arr[mid] > find){
             end = mid-1;
         }
         else{
            start = mid+1;
         }
        }
         if(!found){
            System.out.print("Element not found");
         }
    }

}