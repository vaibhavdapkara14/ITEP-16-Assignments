import java.util.Scanner;

class Program34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base1 : ");
        int base1 = sc.nextInt();
        System.out.println("Enter Base2 : ");
        int base2 =  sc.nextInt();
        System.out.println("Enter height :   ");
        int height = sc.nextInt();

        System.out.println("Enter Wide Walkway Width : ");
        int w_w_Width = sc.nextInt();  

        int t_Area = (base1 + base2) * height / 2;
        int w_w_Area = w_w_Width * height;

        int totalArea = t_Area + w_w_Area;

        System.out.println("Total area after adding the walkway: " + totalArea + " m\u00B2");      
    }
}