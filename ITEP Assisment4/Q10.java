import java.util.Scanner;

class Program10{
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        int i = 0;
        while(i <= n){
            System.out.print(i + " ");
            i = i + 7;
        }

       
    }
}