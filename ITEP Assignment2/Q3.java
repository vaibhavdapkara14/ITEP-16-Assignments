import java.util.Scanner;

class Program3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of tile length :  ");
        int tile_length = sc.nextInt();

        System.out.println("Enter value of tile breadth : ");
        int tile_breadth = sc.nextInt();

        System.out.println("Enter the region length : ");
        int region_length = sc.nextInt();

        System.out.println("Enter the region breadth : ");
        int region_breadth = sc.nextInt();
 
        int Area_tile = (tile_length * tile_breadth);
        int Area_region = (region_length * region_breadth);
        int No_of_tile = (Area_region/Area_tile);


        System.out.println( No_of_tile +" tiles is Required in Rectangular Region");
       


    }
}