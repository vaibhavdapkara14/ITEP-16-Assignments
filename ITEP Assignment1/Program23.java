// 23. Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.

class Program23 {
    public static void main(String[] args) {

       int side_of_box = 3;
       int volume_of_box = side_of_box * side_of_box *side_of_box;

       int carton_length = 15;
       int carton_breadth = 9;
       int carton_height = 12;

       int volume_of_carton = carton_breadth * carton_height * carton_length;

       int Accommodated_box =  volume_of_carton / volume_of_box;

        System.out.println("Number of cubical boxes that can fit in the carton:" + Accommodated_box);
    }
}