import  java.util.Scanner;

class Program33{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter value : ");
      int value = sc.nextInt();
  
      int check = value/2;
      int checkInfo = check*2;

      if(checkInfo == value){
        System.out.println("Number is Even");
      }
      else{
        System.out.println("Number is Odd");

      }

      
  }
}