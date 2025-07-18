import java.util.Scanner;
class Program36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The diameter : ");
        double diameter = sc.nextDouble();
        System.out.println("Enter the Height : ");
        double  height  = sc.nextDouble();
        System.out.println("Enter value of pi : ");
        double   pi = sc.nextDouble(); 

        double radius = diameter/2;  

        double surfaceArea = 2 * pi * radius * (radius + height);

        System.out.println("Surface area of the cylinder: " + surfaceArea + " cm\u00B2");
         
    }
}