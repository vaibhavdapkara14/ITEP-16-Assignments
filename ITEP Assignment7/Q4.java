import java.util.Scanner;
class Program4{


public static void main(String args[]){

    int arr[] = {1,3,2,5,4};
     
     int n = arr.length;
    for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
           }
        }
    }
    for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
    }
  }
}