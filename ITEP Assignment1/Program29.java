// 29. How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?

class Program29 {
    public static void main(String[] args) {

        int floorLength = 800;
        int floorWidth = 900;

        int tileSide = 10;
        int tileArea = tileSide * tileSide;

        int floorArea = floorLength * floorWidth;
        int numberofTiles = floorArea / tileArea;

        System.out.println("Number of tiles required: " + numberofTiles);
    }
}
