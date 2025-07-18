import java.util.Scanner;

class Program39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter of the cylinder (cm): ");
        double diameter = sc.nextDouble();

        System.out.print("Enter height of the cylinder (cm): ");
        double height = sc.nextDouble();

        double pi = 3.1416;
        double radius = diameter / 2;

        double surfaceArea = 2 * pi * radius * (radius + height);

        System.out.println("Surface area of the cylinder: " + surfaceArea + " cm\u00B2");

    }
}
