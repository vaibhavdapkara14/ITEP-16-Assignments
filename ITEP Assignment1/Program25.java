// 25. 100 bricks of length 24 cm and breadth 15 cm are used to tile a path of a garden. What is the area of the path

class Program25 {
    public static void main(String[] args) {

        int brick_Length = 24; 
        int brick_Breadth = 15; 
        int number_Of_Bricks = 100;

        int area_Per_Brick = brick_Length * brick_Breadth;
        int total_Area_Cm2 = area_Per_Brick * number_Of_Bricks;

        double total_Area_M2 = total_Area_Cm2 / 10000.0;

        System.out.println("Area of the path is: " + total_Area_Cm2 + " cm\u00B2");
        System.out.println("Or in square meters: " + total_Area_M2 + " m\u00B2");
    }
}
