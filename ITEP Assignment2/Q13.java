import java.util.Scanner;

class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter One leg value : ");
        int one_leg = sc.nextInt();
        System.out.println("Enter Area of Traingle:  ");
        int area_traingle = sc.nextInt();

        int other_leg = (area_traingle*2)/ one_leg;
        System.out.println(" Other leg of Traingle : " + other_leg + "cm");
    }
}