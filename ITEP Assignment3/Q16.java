import  java.util.Scanner;

class Program16{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Radius ");
      int  Radius  = sc.nextInt();

       double pi = 3.14;

       double Area_of_circle = pi * Radius * Radius;
       System.out.println("Area of Circle : " + Area_of_circle);
  }
}