import java.util.Scanner;

class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of brick : ");
        int brick_Length =   sc.nextInt();
        System.out.println("Enter Breadthof brick : ");
        int  brick_Breadth = sc.nextInt();
        System.out.println("Enter Number of brick : ");
        int  number_Of_Bricks =  sc.nextInt();    

        int area_Per_Brick = brick_Length * brick_Breadth;
        int total_Area_Cm2 = area_Per_Brick * number_Of_Bricks;

        double total_Area_M2 = total_Area_Cm2 / 10000.0;

        System.out.println("Area of the path is: " + total_Area_Cm2 + " cm\u00B2");
        System.out.println("Or in square meters: " + total_Area_M2 + " m\u00B2");    
    }
}