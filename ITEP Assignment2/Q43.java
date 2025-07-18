import java.util.Scanner;

class Program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height of the cone (cm): ");
        double height = sc.nextDouble();

        System.out.print("Enter slant height of the cone (cm): ");
        double slantHeight = sc.nextDouble();

        System.out.print("Enter rate of polishing per cm² (₹): ");
        double rate = sc.nextDouble();

        double pi = 3.1416;
        double radius = Math.sqrt(slantHeight * slantHeight - height * height);
        double area = pi * radius * radius;
        double cost = area * rate;

        System.out.println("Cost of polishing the base: ₹" + cost);

        
    }
}

