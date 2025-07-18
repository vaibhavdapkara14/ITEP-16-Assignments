// 34. A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases. Calculate the area of the wooded area after the addition of the walkway.

class Program34 {
    public static void main(String[] args) {

        int base1 = 128;
        int base2 = 92;
        int height = 40;

        int w_w_Width = 4;

        int t_Area = (base1 + base2) * height / 2;
        int w_w_Area = w_w_Width * height;

        int totalArea = t_Area + w_w_Area;

        System.out.println("Total area after adding the walkway: " + totalArea + " m\u00B2");
    }
}
