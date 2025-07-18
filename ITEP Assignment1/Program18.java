
// 18. Ron jogs around a rectangular park of length 50 m and breadth 30 m. If he takes 10 rounds of the park each day, how much distance does he cover in a day in km?


class Program18{
    public static void main(String args[]){

   
    int length_of_garden = 50;
    int breadth_of_garden = 30;

    int perimeter = 2 * ( length_of_garden + breadth_of_garden);

    int Takes_round = perimeter * 10;
    double Takes_round_in_Km = (Takes_round / 1000.0);

    System.out.println("Ron jogs cover " + Takes_round_in_Km + " km in a day");

    }
} 