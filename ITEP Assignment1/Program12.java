class Program12 {
    public static void main(String[] args) {
        int hypotenuse = 13;
        int oneside = 12;

        double otherside = Math.sqrt(hypotenuse * hypotenuse - oneside * oneside);

        double area_triangle = 0.5 * (oneside * otherside);
        System.out.println("Breadth of Triangle " + otherside + "cm");
        System.out.println("Area of Triangle " + area_triangle + "cm\u00B2");
    }

}