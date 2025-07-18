import java.util.Scanner;

class Program44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter the common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter the term number (n): ");
        int n = sc.nextInt();

        int term = a + (n - 1) * d;

        System.out.println(n + "th term of the A.P. is: " + term);

    }
}
