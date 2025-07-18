import  java.util.Scanner;

class Program26{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Number : ");
      int Number = sc.nextInt();
        
      switch(Number%2){
        case 0:
            System.out.println("Number is even");
            break;
        
        case 1:
            System.out.println("Number is Odd");
            break;

                    
      }
  }
}