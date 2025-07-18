
import java.util.Scanner;

class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base of traingle : ");
        double base = sc.nextDouble();
    
        System.out.println("Enter height of traingle : ");
        double height = sc.nextDouble();
    
        double area_of_isosceles_traingle = (1 * base * height)/2;

        System.out.println("Area of Isosceles Traingle : " + area_of_isosceles_traingle + "cm\u00B2");
        
        
    }
}