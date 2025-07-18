import java.util.Scanner;

class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Area : ");
        int Area = sc.nextInt();
        System.out.println("Enter Breadth : ");
        int  breadth = sc.nextInt();
        System.out.println("Enter Height : " );
        int  height = sc.nextInt();  

        double cofficent = (1 * breadth * height)/2;
        double x = Area/cofficent;
        double y = Math.sqrt(x);

        System.out.println("Height is : " + breadth*y);
        System.out.println("Base is : " + height*y);
    }

}