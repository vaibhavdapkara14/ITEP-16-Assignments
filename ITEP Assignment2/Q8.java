import java.util.Scanner;

class Program8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height of traingle : ");
        double height_traingle = sc.nextDouble();
               
        System.out.println("Enter area of traingle in meter : ");
        double area_in_meter = sc.nextDouble();

        double area_in_cm = area_in_meter*1000;
        double base_traingle = (2*area_in_cm)/height_traingle;
  
        System.out.println("Base of Traingle = " + base_traingle + "m");
        

        
        
         
    }
}