class Program1{
    public static void main(String args[]){

        int perimeter_of_rectangle = 230;
        int lenght_of_rectangle = 70;

        int breadth = (perimeter_of_rectangle / 2) - lenght_of_rectangle;
        int area = (lenght_of_rectangle * breadth);

        System.out.println("breadth is :" + breadth + "cm");
        System.out.println("area is :" + area + "cm2");

    }

}