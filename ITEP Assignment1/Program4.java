class Program4{
    public static void main(String args[]){

      int length_of_rectangular_plot = 300;
      int breadth_of_rectangular_plot = 150;
      int cost_of_tile_per100sq = 6;
     
    
      int area_of_rectangular_plot = length_of_rectangular_plot * breadth_of_rectangular_plot;
      int cost_of_total_tiles = (area_of_rectangular_plot * cost_of_tile_per100sq )/100;


        System.out.println("Total cost of Tiles :" + cost_of_total_tiles + "rs");
       



    }

}