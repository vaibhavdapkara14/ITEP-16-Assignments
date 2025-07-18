// 30. How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide?

class Program30 {
    public static void main(String[] args) {

        int floorLength = 200;
        int floorWidth = 400;

        int tileLength = 5;
        int tileBreadth = 8;

        int floorArea = floorLength * floorWidth;
        int tileArea = tileLength * tileBreadth;

        int numberofTiles = floorArea / tileArea;

        System.out.println("Number of tiles required: " + numberofTiles);
    }
}
