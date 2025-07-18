import  java.util.Scanner;

class Program36{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter value of a : ");
      int a = sc.nextInt();

      System.out.println("Enter value of b : ");
      int  b = sc.nextInt();

      System.out.println("Enter value of c : ");
      int c  = sc.nextInt();

      int sum = a + b + c ;

      if(sum == 180 && a>0 && b>0 && c>0){       
        System.out.println("Valid Traingle");
      }
      
      else{
        System.out.println("InValid Traingle");
      }
  }
}