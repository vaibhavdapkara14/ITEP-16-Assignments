import java.util.Scanner;
class Program5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Total cost: " );
        int  Total_cost = sc.nextInt();

        System.out.println("Enter the value of cost per meter : ");
        int cost_per_m_sqr   = sc.nextInt();

        System.out.println("Enter the value of length");
        int length  = sc.nextInt();

        int perimeter = (Total_cost/cost_per_m_sqr);
        int breadth = (perimeter/2)-length;
        int Area = (length * breadth);

        System.out.println("perimeter is : " + perimeter + "m");
        System.out.println("Breadth is : " + breadth + "m");
        System.out.println("Area is : " + Area + "m\u00B2") ;      

    }
}