
import java.util.Scanner;

class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter lenth of Garden :  ");
        int length_of_garden = sc.nextInt();

        System.out.println("Enter breadth of Garden :  ");
        int breadth_of_garden = sc.nextInt();

        int perimeter = 2 * ( length_of_garden + breadth_of_garden);
         
        int Takes_round = perimeter * 10;
        double Takes_round_in_Km = (Takes_round / 1000.0);


       System.out.println("Ron jogs cover " + Takes_round_in_Km + " km in a day");
       
    }
}