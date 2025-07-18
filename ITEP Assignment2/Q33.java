import java.util.Scanner;
class Program33{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length : ");
        int length = sc.nextInt();

        System.out.println("Enter width : ");
        int width = sc.nextInt();

        System.out.println("Enter pathWidth1 : ");
        int pathWidth1 = sc.nextInt();
        
        System.out.println("Enter pathWidth2 : ");
        int pathWidth2 = sc.nextInt();

        int totalArea = length * width;


        int horizontalPathArea = length * pathWidth1;
        int verticalPathArea = width * pathWidth2;
        int overlapArea = pathWidth1 * pathWidth2;

        int pathArea = horizontalPathArea + verticalPathArea - overlapArea;

        int usableArea = totalArea - pathArea;

        System.out.println("Usable area of the garden: " + usableArea + " m\u00B2");
    }
}