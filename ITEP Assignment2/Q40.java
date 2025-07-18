import java.util.Scanner;

class Program40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder (cm): ");
        double r = sc.nextDouble();

        System.out.print("Enter height of the cylinder (cm): ");
        double h = sc.nextDouble();

        double pi = 3.1416;
        double volume = pi * r * r * h;

        System.out.println("Volume of the cylinder: " + volume + " cm^3");

    }
}
