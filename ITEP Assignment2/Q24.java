
import java.util.Scanner;

class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter wall length in meter: ");
        int wallLength = sc.nextInt();
        System.out.println(" Enter wall height in meter: ");
        int wallHeight = sc.nextInt();
        System.out.println(" Enter wall Thickness in meter : ");
        long wallThickness  = sc.nextLong();       

        System.out.println(" Enter brick length : ");
        int brickLength  = sc.nextInt(); 

        System.out.println(" Enter brick width : ");
        int brickWidth  = sc.nextInt(); 
         
        System.out.println(" Enter brick Thickness : ");
        long brickThickness  = sc.nextLong(); 

        long wallVolume = (long) wallLength * wallHeight * wallThickness;
        double brickVolume = brickLength * brickWidth * brickThickness;
       
        long numberOfBricks = (long)(wallVolume / brickVolume);

        double costPerThousand = 900;

        double totalCost = (numberOfBricks / 1000.0) * costPerThousand;

        System.out.println("Number of bricks required: " + numberOfBricks);
        System.out.println("Total cost to build the wall: $" + totalCost);
    }

}