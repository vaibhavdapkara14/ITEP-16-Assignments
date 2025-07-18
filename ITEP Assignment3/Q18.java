import  java.util.Scanner;

class Program18{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Total Marks : ");
      double TotalMarks = sc.nextInt();

      System.out.println("Enter Obtained Marks :  ");
      double ObtainedMarks  = sc.nextInt();

      double percentage = (ObtainedMarks/TotalMarks) * 100;


      System.out.println("Percentage is : " + percentage + "%");
  }
}