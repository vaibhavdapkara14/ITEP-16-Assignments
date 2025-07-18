
import java.util.Scanner;

class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter perimeter :  ");
        int perimeter = sc.nextInt();

        int side = perimeter / 4;
        int area = side * side;

        System.out.println("Area of the square is :  " +area + " m\u00B2");
                
    }
}