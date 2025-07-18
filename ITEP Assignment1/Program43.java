// 43. Find the cost of polishing the base of a cone whose height is 4cm and slant height 5 cm at the rate of 10 rs. Per sq. cm

class Program43 {
    public static void main(String[] args) {

        double height = 4;
        double slantHeight = 5;
        double rate = 10;
        double pi = 3.1416;

        double radius = Math.sqrt(slantHeight * slantHeight - height * height);
        double area = pi * radius * radius;
        double cost = (area * rate);

        System.out.println("Cost of polishing the base: ₹" + cost);
        // System.out.println("Cost of polishing the base: ₹" + cost);

    }
}
