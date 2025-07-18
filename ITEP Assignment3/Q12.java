import  java.util.Scanner;

class Program12{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Value");
      int  value = sc.nextInt();

      int reverse = 0;
      while(value > 0){
      int digit = value % 10;
      reverse = reverse * 10 + digit;
      value = value / 10;
      }

      System.out.println("Reversed value is :" + reverse);
  }
}