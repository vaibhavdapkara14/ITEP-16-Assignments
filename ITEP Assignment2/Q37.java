import java.util.Scanner;
  
  class q37 {


    public static void main (String args[]){

Scanner sc = new Scanner(System.in);
    
    
System.out.println("area :");
 Float  area = sc.nextFloat();
    
    
System.out.println("height  :");
 int   height = sc.nextInt();
 float radius = area/(2* 3.14f * height);
    float diameter = radius*2f;
    System.out.println("diameter: " +diameter);

    }}
