import java.util.Scanner;

class Program3{
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(" " + i*i);
        }
    }
}