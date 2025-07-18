import java.util.Scanner;

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a : ");
        float a = sc.nextFloat();

        System.out.print("Enter side b : ");
        float b = sc.nextFloat();

        System.out.print("Enter the perimeter of the triangle : ");
        float perimeter = sc.nextFloat();

        float c = perimeter - (a + b);
        float s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Side c is: " + c + " cm");
        System.out.println("The area of the triangle is: " + area + " cm\u00B2");

        
    }
}