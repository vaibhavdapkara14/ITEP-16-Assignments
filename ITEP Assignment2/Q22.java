import java.util.Scanner;

class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter Pond Length : ");
        int pond_length = sc.nextInt();
        System.out.println(" Enter Pond Width : ");
        int pond_width = sc.nextInt();
        System.out.println(" Enter Pond Depth :  ");
        int pond_depth =  sc.nextInt();     

        int volume_of_pond = (pond_depth*pond_length*pond_width);

        System.out.println("capacity of pond is " + volume_of_pond + " m^3");   
    }
}