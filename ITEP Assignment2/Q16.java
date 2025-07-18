import java.util.Scanner;

class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of length : ");
        int length = sc.nextInt();
        System.out.println(" Enter value of width : ");
        int width = sc.nextInt();

        int Area = length * width;
         

        System.out.println("Tina need to buy " + Area + " meter\u00B2 of carpet");
        
               
    }
}