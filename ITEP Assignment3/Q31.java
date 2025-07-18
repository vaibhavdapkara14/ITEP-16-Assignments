import java.util.Scanner;

    class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        float temp, result;

        System.out.print("Enter 'c' to convert Fahrenheit to Celsius or 'f' to convert Celsius to Fahrenheit: ");
        choice = sc.next().charAt(0);

        if (choice == 'c' || choice == 'C') {
            System.out.print("Enter temperature in Fahrenheit: ");
            temp = sc.nextFloat();
            result = (temp - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + result);
        } 
        else if (choice == 'f' || choice == 'F') {
            System.out.print("Enter temperature in Celsius: ");
            temp = sc.nextFloat();
            result = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + result);
        } 
        else {
            System.out.println("Invalid choice.");
        }

        
    }
}

