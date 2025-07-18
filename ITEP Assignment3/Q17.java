import  java.util.Scanner;

class Program17{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Length : ");
      int length = sc.nextInt();

      System.out.println("Enter Breadth : ");
      int  Breadth = sc.nextInt();

       int Area_of_Rectangle = length * Breadth;
      System.out.println("Area of Rectangle : " + Area_of_Rectangle);
     
  }
}