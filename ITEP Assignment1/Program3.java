class Program3{
    public static void main(String args[]){

      int length_of_tiles = 13;
      int breadth_of_tiles = 7;
     
       int  length_of_covered_area = 520;
       int  breadth_of_covered_area = 140;

       int area_of_tiles = length_of_tiles * breadth_of_tiles;
       int area_of_covered_area = length_of_covered_area * breadth_of_covered_area;
       int number_of_tile =  (area_of_covered_area / area_of_tiles);

        System.out.println("Area_of_covered_area: " + area_of_covered_area + "cm^2");
        System.out.println("Area_of_tiles:" + area_of_tiles + "cm^2");
        System.out.println("Number_of_tile:" + number_of_tile + "cm^2");



    }

}