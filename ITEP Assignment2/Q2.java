import java.util.Scanner;

class Program2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of  Area of Reactangular");
        int Area_of_Rectangle = sc.nextInt();

        System.out.println("Enter value of breadth");
        int breadth = sc.nextInt();
        
        int length  = (Area_of_Rectangle/breadth);
        int perimeter = 2 * (length + breadth);

        System.out.println("Length is : " + length + "cm");
        System.out.println("Perimeter is  : " + perimeter + "cm");

    }
}
