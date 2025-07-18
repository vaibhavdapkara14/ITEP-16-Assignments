// 6. Write a program to print absolute vlaue of a number entered by user. E.g.-
// INPUT: 1        OUTPUT: 1
// INPUT: -1        OUTPUT: 1



import  java.util.Scanner;

class Program6{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the Value ");
      int  value = sc.nextInt();

      if ( value < 0){
        int absolute_value = Math.abs(value);
        System.out.println("value is : " + absolute_value);
        
      }
      else{
        System.out.println("value is : " + value);
      }
  }
}