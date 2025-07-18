// Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
import  java.util.Scanner;

class Program8{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Total Number of Class Held : ");
      int  Total_class = sc.nextInt();

      System.out.println("Enter Your Attend How much Class : ");
      int  Attend_class = sc.nextInt();


      int percentage = ( (Attend_class * 100 )/Total_class);

      System.out.println("Your attendence is " + percentage + "%");

      if(percentage > 75 && percentage >= 100){
        System.out.println("You are Eligible for Entering the exam");

      }
      
      else{
        System.out.println("You have a medical issue enter Y and N : ");
        char medical = sc.next().charAt(0);
        if( medical == 'Y' || medical == 'y'){
        System.out.println("You are Eligible for Entering the exam");

        }
        else{
        System.out.println("You are not Eligible for Entering the exam");
        }
      }
  }
}