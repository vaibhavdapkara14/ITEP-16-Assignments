// 21. A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres?

class Program21 {
    public static void main(String[] args) {

        int brickLength = 15;
        int brickBreadth = 8;
        int brickHeight = 5;

        int wallLength = 15 * 100;
        int wallBreadth = 10 * 100;
        int wallHeight = 8 * 100;

        int brickVolume = brickLength * brickBreadth * brickHeight;
        long wallVolume = (long) wallLength * wallBreadth * wallHeight;

        long numberOfBricks = wallVolume / brickVolume;

        System.out.println("Total number of bricks needed: " + numberOfBricks);
    }
}
