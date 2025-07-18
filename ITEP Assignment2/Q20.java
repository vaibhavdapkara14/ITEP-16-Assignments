
import java.util.Scanner;

class Program20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length :  ");
        int  length = sc.nextInt();
        System.out.println("Enter breadth : ");
        int breadth = sc.nextInt();
        System.out.println("Enter height : ");
        int height = sc.nextInt();    

        int volume = length * breadth * height;

        System.out.println("Volume of Brick of Ice-cream is : " + volume + "cm^3");
        
    }
}