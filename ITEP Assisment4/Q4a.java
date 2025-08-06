import java.util.Scanner;

class Program4a{
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=n; i++){
          sum = sum + i;
        }
          System.out.println("Total Sum of 1 to " + n + " is : " + sum);
    }
}