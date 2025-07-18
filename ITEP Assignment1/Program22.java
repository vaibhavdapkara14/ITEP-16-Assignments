// 22. A pond is 50 m long, 30 m wide and 2 m deep. Find the capacity of the pond in cubic metre.

class Program22 {
    public static void main(String[] args) {

       int pond_length = 50;
       int pond_width = 30;
       int pond_depth = 2;

       int volume_of_pond = (pond_depth*pond_length*pond_width);

        System.out.println("capacity of pond is " + volume_of_pond + " m^3");
    }
}