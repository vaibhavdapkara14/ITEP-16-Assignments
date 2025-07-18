import java.util.Scanner;

    class Program39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        if (amount >= 2000) {
            int n_2000 = amount / 2000;
            amount = amount % 2000;
            System.out.println("₹2000 notes: " + n_2000);
        }

        if (amount >= 500) {
            int n_500 = amount / 500;
            amount = amount % 500;
            System.out.println("₹500 notes: " + n_500);
        }

        if (amount >= 200) {
            int n_200 = amount / 200;
            amount = amount % 200;
            System.out.println("₹200 notes: " + n_200);
        }

        if (amount >= 100) {
            int n_100 = amount / 100;
            amount = amount % 100;
            System.out.println("₹100 notes: " + n_100);
        }

        if (amount >= 50) {
            int n_50 = amount / 50;
            amount = amount % 50;
            System.out.println("₹50 notes: " + n_50);
        }

        if (amount >= 20) {
            int n_20 = amount / 20;
            amount = amount % 20;
            System.out.println("₹20 notes: " + n_20);
        }

        if (amount >= 10) {
            int n_10 = amount / 10;
            amount = amount % 10;
            System.out.println("₹10 notes: " + n_10);
        }

        if (amount >= 5) {
            int n_5 = amount / 5;
            amount = amount % 5;
            System.out.println("₹5 notes: " + n_5);
        }

        if (amount >= 2) {
            int n_2 = amount / 2;
            amount = amount % 2;
            System.out.println("₹2 coins: " + n_2);
        }

        if (amount >= 1) {
            int n_1 = amount / 1;
            amount = amount % 1;
            System.out.println("₹1 coins: " + n_1);
        }

        
    }
}
