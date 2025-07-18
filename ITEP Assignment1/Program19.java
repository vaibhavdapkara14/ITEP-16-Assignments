// 19. A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has more volume?

class Program19{
    public static void main(String args[]){

        int cube_edge = 7;
        int volume_of_cube = cube_edge * cube_edge * cube_edge;

        int cuboid_length = 7;
        int cuboid_breadth = 4;
        int cuboid_height = 8;

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