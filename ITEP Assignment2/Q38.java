import java.util.Scanner;

class Program38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter volume of the cylinder cm³: ");
        double volume = sc.nextDouble();

        System.out.print("Enter radius of the cylinder cm: ");
        double radius = sc.nextDouble();

        double pi = 3.1416;

        double height = volume / (pi * radius * radius);
        double surfaceArea = 2 * pi * radius * (radius + height);

        System.out.println("Surface area of the cylinder: " + surfaceArea + " cm\u00B2");

        
    }
}

