// 39. Find the surface of the cylinder if its diameter is 12 centimeters and its height is 9 centimeters.

class Program39 {
    public static void main(String[] args) {

        double diameter = 12;
        double height = 9;
        double pi = 3.1416;

        double radius = diameter / 2;
        double surfaceArea = 2 * pi * radius * (radius + height);


        System.out.println("Surface area of the cylinder: " + surfaceArea + " cm\u00B2");
    }
}
