import  java.util.Scanner;

class Program20{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter value of a: ");
      int a = sc.nextInt();

      System.out.println("Enter value of b: ");
      int b = sc.nextInt();

      System.out.println("Before swap value of a: " + a);
      System.out.println("After swap  value of b: " + b);
  
      a = a ^ b ;
      b = a ^ b ; 
      a = a ^ b;

      System.out.println("Before swap value of a: " + a);
      System.out.println("After swap  value of b: " + b);


   
  }
}