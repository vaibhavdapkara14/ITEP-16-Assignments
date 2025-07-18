import  java.util.Scanner;

class Program5{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Ram age : ");
      int  Ram = sc.nextInt();

      System.out.println("Enter Udit age : ");
      int Udit  = sc.nextInt();

      System.out.println("Enter Pinku age : ");
      int   Pinku = sc.nextInt();

      if( Ram > Udit && Ram > Pinku){
        System.out.println("Ram is Oldest Person");
      }
      else if( Udit > Ram && Udit > Pinku){
        System.out.println("Udit is Oldest Person");

      }
      else{
        System.out.println("Pinku is Oldest Person");
     }


     if( Ram < Udit && Ram < Pinku){
        System.out.println("Ram is Youngest Person");
      }
      else if( Udit < Ram && Udit < Pinku){
        System.out.println("Udit is Youngest Person");

      }
      else{
        System.out.println("Pinku is Youngest Person");

      }

  }
}