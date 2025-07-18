// 38. The cylinder has a volume of 1287. The base has a radius 10. What is the area of the surface of the cylinder?

class Program38 {
    public static void main(String[] args) {

        double volume = 1287;
        double radius = 10;
        double pi = 3.1416;

        double height = volume / (pi * radius * radius);
        double surfaceArea = 2 * pi * radius * (radius + height);


        System.out.println("Surface area of the cylinder: " + surfaceArea + " cm\u00B2");
    }
}


