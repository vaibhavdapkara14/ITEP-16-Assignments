import java.util.Scanner;

class Program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path length in meters: ");
        double pathLengthMeters = sc.nextDouble();

        System.out.print("Enter path breadth in meters: ");
        double pathBreadthMeters = sc.nextDouble();

        System.out.print("Enter brick length in cm: ");
        int brickLength = sc.nextInt();

        System.out.print("Enter brick breadth in cm: ");
        int brickBreadth = sc.nextInt();

        int pathLength = (int)(pathLengthMeters * 100);
        int pathBreadth = (int)(pathBreadthMeters * 100);

        int pathArea = pathLength * pathBreadth;
        int brickArea = brickLength * brickBreadth;

        int numberOfBricks = pathArea / brickArea;

        System.out.println("Number of bricks required: " + numberOfBricks);

        
    }
}
