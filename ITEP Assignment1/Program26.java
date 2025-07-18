// 26. How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?

class Program26 {
    public static void main(String[] args) {

        int pathLength = 120 * 100;
        int pathBreadth = (int)(2.4 * 100);

        int brickLength = 24;
        int brickBreadth = 15;

        int pathArea = pathLength * pathBreadth;
        int brickArea = brickLength * brickBreadth;

        int numberofBricks = pathArea / brickArea;

        System.out.println("Number of bricks required: " + numberofBricks);
    }
}
