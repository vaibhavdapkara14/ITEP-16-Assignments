import java.util.Scanner;

class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of shelly garden : ");
        int S_length = sc.nextInt();

        System.out.println(" Enter the breadth of shelly garden ");
        int S_breadth  = sc.nextInt();

        System.out.println("Enter the side of Rachel garden : ");
        int R_side = sc.nextInt();

        double S_Area = S_length * S_breadth;
        double R_Area = R_side * R_side;

        System.out.println("Size of Shelly Garden is : " + S_Area  + " m");
        
        System.out.println("Size of Rachel Garden is : " + R_Area + " m");

 
        if(R_Area > S_Area){
        System.out.println("Rachel Garden is Greather Than Shelly Garden ");

        }
        else{
        System.out.println("Shelly Garden is Greather Than Rachel Garden");
        
        }
    }
}