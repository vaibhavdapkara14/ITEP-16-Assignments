import java.util.Scanner;

class Program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Garden Side : ");
        int gardenSide = sc.nextInt();
        System.out.println("Enter Pool Side : ");
        int  poolSide = sc.nextInt();
         int gardenArea = gardenSide * gardenSide;
        int poolArea = poolSide * poolSide;

        int remainingArea = gardenArea - poolArea;

        System.out.println("Area of the garden excluding the swimming pool: " + remainingArea + " m\u00B2");
          
    }
}