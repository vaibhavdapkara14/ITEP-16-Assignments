class Program37 {
    public static void main(String[] args) {
        double sa = 149;
        double h = 6;
        double pi = Math.PI;

        /* Solve using trial or quadratic: sa = 2πr(r + h)*/
        double r = 2.5;
        double CheckSA = 2 * pi * r * (r + h);
        double diameter = 2 * r;
        System.out.printf("Approximate diameter: %.2f cm%n", diameter);
    }
}