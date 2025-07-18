import  java.util.Scanner;

class Program32{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Number ");
      int  Number = sc.nextInt();

      if(Number > 0){       
      System.out.println("Positive (+) sign");     
      }
      else if(Number == 0){
      System.out.println("Neutral");
      }
      else{
      System.out.println(" Negative(-) sign");     

      }

  }
}