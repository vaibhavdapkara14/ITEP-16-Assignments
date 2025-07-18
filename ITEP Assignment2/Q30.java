import java.util.Scanner;

class Program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter floor Length :  ");
        int floorLength = sc.nextInt();
        System.out.println(" Enter Floor Width :  ");
        int floorWidth =  sc.nextInt();

        System.out.println("Enter tile Length :  ");
        int tileLength = sc.nextInt();  

        System.out.println("Enterc tile Breadth : ");
        int tileBreadth = sc.nextInt();   

        int floorArea = floorLength * floorWidth;
        int tileArea = tileLength * tileBreadth;

        int numberofTiles = floorArea / tileArea;

        System.out.println("Number of tiles required: " + numberofTiles);   
    }
}