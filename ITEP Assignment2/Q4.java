import java.util.Scanner;
class Program4{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

        
    System.out.println("Enter the tiling length");
    int  length = sc.nextInt();

    System.out.println("Enter the tiling breadth");
    int breadth = sc.nextInt();

    System.out.println("Enter the Per Hundred square " );
    int per_100_sqr = sc.nextInt();

    int area = (length * breadth);
    int cost = (area * per_100_sqr)/100;

    System.out.println("Cost of Total Tiling is : " + "$"+cost);


    }
}