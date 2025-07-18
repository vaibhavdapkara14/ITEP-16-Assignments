import java.util.Scanner;

class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of area :  ");
        int  area = sc.nextInt();
        System.out.println(" Enter value of base : ");
        int  base =  sc.nextInt();

        int height = ( area / base ) * 2 ;

        System.out.println("Height of Traingle : " +  height + "cm");

          
    }
}