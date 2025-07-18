import  java.util.Scanner;

class Program28{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter value of a : ");
      int a = sc.nextInt();

      
      System.out.println("Enter value of b : ");
      int b = sc.nextInt();

 
       System.out.println("Enter which type of Operation perform : ");
        char Arithematic = sc.next().charAt(0);
      switch(Arithematic){
        case '+':
            System.out.println("Adding : " + (a+b));
            break;
        
        case '-':
            System.out.println("Substract : " + (a-b) );
            break;
        
        case '*':
            System.out.println("Multiplication : " + (a*b));
            break;

        case '/':
            System.out.println("Divide  :"  + (a/b));
            break;

        case '%':
            System.out.println("Module : " + (a%b));
            break;

        default:
            System.out.println("Choose only Arithematic operation");

      }
  }
}