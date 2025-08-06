import java.util.Scanner;

class Program8{
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();
     
        int n1 = 1;
        int n2 = 2;
        int i=1;

        while( i <= n){
        System.out.print(n1 + " ");
            int n3 = n2 * n1;
            n1 = n2;
            n2 = n3;
         i++;
        }
    }
}
