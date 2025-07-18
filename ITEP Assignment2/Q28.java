import java.util.Scanner;
class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length :  ");
        int length = sc.nextInt();
        System.out.println("Enter Width:  ");
        int  width =  sc.nextInt();
        System.out.println("Enter Rate :  ");
        int rate = sc.nextInt(); 

        int area = length * width;
        int price = area * rate;

        System.out.println("The price of tiling the dining room is: $" + price);       
    }
}