import java.util.Scanner;
class Program4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Size of column : ");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        for(int i= 0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print("Enter the " + (i+1)+ " row " + (j+1) + " value: ");
                arr[i][j] = sc.nextInt();
            }
        }

           int j;
             int i;
        
           System.out.println("\nMatrix is...");

        for( i = 0; i<rows; i++){
            for( j=0; j<columns; j++){
                System.out.print(arr[i][j] + " ");
            }
                    System.out.println( " ");
            
        }
     
           System.out.println("\nDiagonal is...");
        
        for(i=0; i<rows; i++){
            for (j=0; j<columns; j++){
                if(i<j){
                    System.out.print(arr[i][j]+ " ");
                }
            }
        }
    }
}

