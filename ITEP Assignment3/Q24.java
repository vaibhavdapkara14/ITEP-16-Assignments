import  java.util.Scanner;

class Program23{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Number ");
      int  Number = sc.nextInt();

      if(Number > 0){       
      System.out.println("Number is Positive ");     
      }
      else{
      System.out.println("Number is Negative");
      }

  }
}