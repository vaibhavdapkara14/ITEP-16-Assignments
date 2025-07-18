
import java.util.Scanner;

class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of vertix1 ");
        int vertix1 = sc.nextInt();
        System.out.println("Enter value of vertix2 ");
        int vertix2 = sc.nextInt();

        System.out.println("Enter value of quadrilateral ");
        int quadrilateral = sc.nextInt();



        double Area = (1 * (vertix1 + vertix2) * quadrilateral)/2;

        System.out.println("Area of Daigonal :" + Area + " m");
        
    }
}