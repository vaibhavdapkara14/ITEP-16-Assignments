// 24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wally?

class Program24 {
    public static void main(String[] args) {

        int wallLength = 20 * 100; 
        int wallHeight = 2 * 100;  
        int wallThickness = (int)(0.75 * 100); 

        double brickLength = 25;
        double brickWidth = 10;
        double brickThickness = 7.5;

        long wallVolume = (long) wallLength * wallHeight * wallThickness;
        double brickVolume = brickLength * brickWidth * brickThickness;

        long numberOfBricks = (long)(wallVolume / brickVolume);

        double costPerThousand = 900;

        double totalCost = (numberOfBricks / 1000.0) * costPerThousand;

        System.out.println("Number of bricks required: " + numberOfBricks);
        System.out.println("Total cost to build the wall: $" + totalCost);
    }
}
