import java.util.Scanner;

class Program4b{
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=n; i++){
          if(i%2 == 0){
            sum = sum - i;
          }
          else{
            sum = sum + i;
          }
        }
          System.out.println("Total Sum of 1 to " + n + " is : " + sum);
    }
}