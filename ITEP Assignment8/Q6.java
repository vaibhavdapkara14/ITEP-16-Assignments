import java.util.Scanner;
class Program6{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

      System.out.print("Enter Size of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Size of column : ");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];
        int arr1[][] =  new int[rows][columns];
        int sumarr[][] = new int[rows][columns];

         System.out.println("Enter Matrix A Elements...");
         for(int i= 0; i<rows; i++){
            System.out.println("Enter the elements of arr1 and arr2 one by one");
            for(int j=0; j<columns; j++){
                arr[i][j] = sc.nextInt();
                arr1[i][j] = sc.nextInt();
                sumarr[i][j] = arr[i][j] + arr1[i][j];
            }       
        }

        System.out.println("Sum of Two Matrixis..");
        for(int row[] : sumarr){
            for(int elements : row){
                System.out.print(elements+" ");
            }
            System.out.println();
        }
    }
}