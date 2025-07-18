class Program11{
    public static void main(String args[]){
     int area =320;
     int breadth = 8;
     int height = 5;

     double cofficent = 0.5 * breadth * height;
     double x = area/cofficent;
     double y = Math.sqrt(x);

     System.out.println("Height is : " + breadth*y);
     System.out.println("Base is : " + height*y);




    }
} 