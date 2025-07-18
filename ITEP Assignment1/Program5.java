class Program5{
    public static void main(String args[]){

       int total_cost = 1600;
       int cost_per_meter = 25;
       int length = 20;

       int perimeter = (total_cost / cost_per_meter);
       int breadth  = (perimeter/2)-length;
       int area = length * breadth;

       System.out.println("Perimeter is : " + perimeter  + " meter");
       System.out.println("Breadth is : " + breadth  + " meter");
       System.out.println("Area is : " + area + " meter^2" );


    }
}