import java.util.Scanner;

class Program1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length : ");
        int length = sc.nextInt();

        System.out.println("Enter Breadth : ");
        int breadth = sc.nextInt();

        if(length == breadth)
        System.out.println("It is Square ");

        else
        System.out.println("It is not square");
    }
}