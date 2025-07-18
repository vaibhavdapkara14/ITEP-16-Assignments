// 7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.


import  java.util.Scanner;

class Program7{
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
        System.out.println("You are not Eligible for Entering the exam");

      }
  }
}