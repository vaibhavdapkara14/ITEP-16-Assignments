import  java.util.Scanner;

class Program15{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter cost of Bike :  ");
      int cost = sc.nextInt();

      float tax;
      float Totalwithtax ;
      if( cost > 100000){

      Totalwithtax = 1.15f;
      tax = Totalwithtax - cost;
      System.out.println("Tax for bike more than 100000 : " + tax);

     }
      
      else if(cost > 50000 && cost <= 100000){
      Totalwithtax = cost * 1.10f;
      tax = Totalwithtax - cost;

      System.out.println("Tax for bike more than 50000 : " + tax);
      }

      else if(cost <= 50000){
      Totalwithtax = cost*1.05f;
      tax = Totalwithtax-cost;
      System.out.println("tax for bike less than 50000 : "+tax);
        }
  }
}