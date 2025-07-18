import java.util.Scanner ;

class Program1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the perimeter");
        int perimeter = sc.nextInt(); 

        System.out.println("Enter the length");
        int length = sc.nextInt();
  
        int breadth = (perimeter/2)-length;
        int area = length * breadth;

        System.out.println("Breadth is : " + breadth + "cm");
        System.out.println("Area is :  " + area + "cm\u00B2");

    }
}