import java.util.Scanner;

   class Program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double units, amount = 0, surcharge, totalBill;

        System.out.print("Enter total electricity units consumed: ");
        units = sc.nextDouble();

        if (units <= 50) {
            amount = units * 0.50;
        } 
        else if (units <= 150) {
            amount = (50 * 0.50) + ((units - 50) * 0.75);
        }
         else if (units <= 250) {
            amount = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } 
        else {
            amount = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }

        surcharge = amount * 0.20;                                                                                  cccccccccc   
        totalBill = amount + surcharge;

        System.out.printf("Electricity Bill = Rs. %.2f\n", totalBill);

    }
}

