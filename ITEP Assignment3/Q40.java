import  java.util.Scanner;

class Program40{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Cost Price : ");
      int  cost = sc.nextInt();

      System.out.println("Enter Selling Price : ");
      int selling = sc.nextInt();

      int Total = selling - cost;
      if(selling > cost){
      System.out.println("Your profit is :" + Total);
      }
      else{
      System.out.println("Your lose is : " + Total);

      }
  }
}