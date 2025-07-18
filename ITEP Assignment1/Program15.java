// Shelly has a rectangular garden of length 22 m and breath 15 m. Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?

class Program15{
    public static void main(String args[]){

        int S_length  = 22;
        int S_breadth = 15;

        double S_Area = S_length * S_breadth;

        int R_side = 21;

        double R_Area = R_side * R_side;

        System.out.println("Size of Shelly Garden is : " + S_Area  + " m");
        
        System.out.println("Size of Rachel Garden is : " + R_Area + " m");

 
        if(R_Area > S_Area){
        System.out.println("Rachel Garden is Greather Than Shelly Garden ");

        }
        else{
        System.out.println("Shelly Garden is Greather Than Rachel Garden");

        }
    }
}