//  27. Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m.

class Program27 {
    public static void main(String[] args) {

        int length = 20;
        int width = 15;
        int rate = 5;

        int area = length * width;
        int cost = area * rate;

        System.out.println("The cost of tiling the dining room is: $" + cost);
    }
}
