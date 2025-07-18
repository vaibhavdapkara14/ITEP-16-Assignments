class Program2{
    public static void main(String args[]){

        int area_of_rectangle = 96;
        int breadth_of_rectangle = 8 ;

        int length = (area_of_rectangle / breadth_of_rectangle);
        int perimeter = 2*(length + breadth_of_rectangle);

        System.out.println("length is :" + length + "cm");
        System.out.println("perimeter is :" + perimeter + "cm");

    }
}
