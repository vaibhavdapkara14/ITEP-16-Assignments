// 36. What is the surface area of a cylinder if the diameter is 15m height is 7m?

class Program36 {
    public static void main(String[] args) {

        double diameter = 15;
        double radius = diameter / 2;
        double height = 7;
        double pi = 3.1416;

        double surfaceArea = 2 * pi * radius * (radius + height);

        System.out.println("Surface area of the cylinder: " + surfaceArea + " m\u00B2");
    }
}
