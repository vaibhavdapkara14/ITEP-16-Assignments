import java.util.Scanner;
class Program2{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int arr[] = {12,23,45,76,35,56};
    int max = arr[0];
    int min = arr[0];

    
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];

            }
            if(arr[i] < min){
                min = arr[i];

            }
        }
    
     
            System.out.println("Maximum Element is : " + max + " ");
            System.out.print("Minimum Element is : " + min + " ");
    }
    


}