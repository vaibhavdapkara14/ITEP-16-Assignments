import java.util.Scanner;

class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Brick Length :");
        int brickLength = sc.nextInt();
        System.out.println("Enter Brick Breadth : ");
        int brickBreadth =  sc.nextInt();
        System.out.println("Enter Brick Height : ");
        int brickHeight  = sc.nextInt();     

        System.out.println("Enter wall Height : ");
        int wallHeight  = sc.nextInt();

        System.out.println("Enter wall Breadth : ");
        int wallBreadth  = sc.nextInt();

        System.out.println("Enter wall Length : ");
        int wallLength  = sc.nextInt();   

        wallLength = wallLength * 100;
        wallBreadth = wallBreadth * 100;
        wallHeight = wallHeight * 100;

        int brickVolume = brickLength * brickBreadth * brickHeight;
        long wallVolume = (long) wallLength * wallBreadth * wallHeight;
        long numberOfBricks = wallVolume / brickVolume;

        System.out.println("Total number of bricks needed: " + numberOfBricks);

        

    }

}