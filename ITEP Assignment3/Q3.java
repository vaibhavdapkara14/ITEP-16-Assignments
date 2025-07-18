import java.util.Scanner;

class Program3{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("How Many Years of Experience : ");
       int Experience = sc.nextInt();

       System.out.println("What is Your Salary : ");
       int Salary = sc.nextInt();


       if(Experience > 5 ){

        double Bonus = (5 * Salary)/100;
         System.out.println("Your Salary with bonus is " + Bonus);
       }
       else{
        System.out.println("Your Salary is " + Salary );
         
       }
   }
}