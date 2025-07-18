class Program6 {
    public static void main(String[] args) {
    
        float a = 10;
        float b = 9;
        float perimeter = 36;
        
       float c = perimeter - (a + b);
        float s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of the triangle is: " + area + " cm^2");
    }
}