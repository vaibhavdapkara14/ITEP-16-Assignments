import java.util.Scanner;

class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length : ");
        int length = sc.nextInt();
        System.out.println("Enter width : ");
        int  width = sc.nextInt();

        int perimeter = 2 * (length + width);
        
        System.out.println("The length of Ribbon need is :" + perimeter + " m");
        
    }
}