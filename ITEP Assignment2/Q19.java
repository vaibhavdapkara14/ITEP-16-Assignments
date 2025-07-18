import java.util.Scanner;

class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cube edge : ");
        int cube_edge = sc.nextInt();


        System.out.println(" Enter Cuboid length : ");
        int cuboid_length = sc.nextInt();

        System.out.println("Enter cuboid Breadth : ");
        int cuboid_breadth = sc.nextInt();   
        
        System.out.println("Enter cuboid height : ");
        int cuboid_height = sc.nextInt();  
 
        int volume_of_cube = cube_edge * cube_edge * cube_edge;
        int volume_of_cuboid = (cuboid_breadth * cuboid_length * cuboid_height);
        
        System.out.println("volume of cube is :" + volume_of_cube + "cm^3");
        System.out.println("volume of cuboid is :" + volume_of_cuboid + "cm^3");

        if(volume_of_cube > volume_of_cuboid){
        System.out.println("volume of cube is greater than volume of cuboid");
        }
        
        else{
        System.out.println("volume of cuboid is greater than volume of cube");

        }

    }
}