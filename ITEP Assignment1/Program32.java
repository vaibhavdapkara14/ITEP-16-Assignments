// 32. A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of  25m . Calculate the area of the garden.

class Program32 {
    public static void main(String[] args) {

        int gardenSide = 150;
        int poolSide = 25;

        int gardenArea = gardenSide * gardenSide;
        int poolArea = poolSide * poolSide;

        int remainingArea = gardenArea - poolArea;

        System.out.println("Area of the garden excluding the swimming pool: " + remainingArea + " m\u00B2");
    }
}
