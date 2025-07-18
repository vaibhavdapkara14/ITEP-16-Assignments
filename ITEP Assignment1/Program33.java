// 33. A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two pathways that run perpendicular from its sides. One pathway has a width of 3 m and the other, 4 m. Calculate the total usable area of the garden.

class Program33 {
    public static void main(String[] args) {

        int length = 30;
        int width = 20;

        int pathWidth1 = 3;
        int pathWidth2 = 4;

        int totalArea = length * width;

        int horizontalPathArea = length * pathWidth1;
        int verticalPathArea = width * pathWidth2;
        int overlapArea = pathWidth1 * pathWidth2;

        int pathArea = horizontalPathArea + verticalPathArea - overlapArea;

        int usableArea = totalArea - pathArea;

        System.out.println("Usable area of the garden: " + usableArea + " m\u00B2");
    }
}
