import java.util.Scanner;

class Program2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter Quantity : ");
        int Quantity = sc.nextInt();

         int cost = Quantity * 100;

        if(cost > 1000){
          int Discount = cost/10 ;

          System.out.println("After Discount Total price is :" + ( cost - Discount) );
        }
        else{
        System.out.println("Total price is : " + cost);
        }
    }
}