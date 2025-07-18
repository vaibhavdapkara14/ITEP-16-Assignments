
// 35. Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.
class Program35 {
    public static void main(String[] args) {

        double radius = 7.7;
        double height = 12;
        double pi = 3.1416;

        double surfaceArea = 2 * pi * radius * (radius + height);

        System.out.println("Surface area of the cylinder: " + surfaceArea + " cm\u00B2");
    }
}
