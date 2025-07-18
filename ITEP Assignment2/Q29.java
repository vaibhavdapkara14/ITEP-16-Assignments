
import java.util.Scanner;

class Program29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter floor Length :  ");
        int floorLength =  sc.nextInt();

        System.out.println("Enter floor Width :  ");
        int floorWidth =  sc.nextInt();

        System.out.println("Enter tile side : ");
        int tileSide = sc.nextInt();

        int tileArea = tileSide * tileSide;

        int floorArea = floorLength * floorWidth;
        int numberofTiles = floorArea / tileArea;

        System.out.println("Number of tiles required: " + numberofTiles);       
    }
}