import  java.util.Scanner;

class Program27{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a  Letter  a to z : ");
      char Letter = sc.next().charAt(0);
    //   char a,e,i,o,u; 
      switch(Letter){
        case 'a':
            System.out.println("It is a vowel");
            break;
        
        case 'e':
            System.out.println("It is a vowel");
            break;
        
        case 'i':
            System.out.println("It is a vowel");
            break;

        case 'o':
            System.out.println("It is a vowel");
            break;

        case 'u':
            System.out.println("It is a vowel");
            break;

        default:
            System.out.println("It is not a vowel");

      }
  }
}