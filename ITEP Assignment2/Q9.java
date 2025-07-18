
import java.util.Scanner;

class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the value of side traingle : ");
        double side_triangle = sc.nextDouble();
        
        double area_traingle = (Math.sqrt(3)/4) * side_triangle * side_triangle;
        System.out.println("Area of euilateral traingle : " + area_traingle + "cm");
        
    }
}