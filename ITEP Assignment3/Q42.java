import java.util.Scanner;

    class Program42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basicSalary, hra, da, grossSalary;

        System.out.print("Enter basic salary: ");
        basicSalary = sc.nextDouble();

        if (basicSalary <= 10000) {
            hra = basicSalary * 0.20;
            da = basicSalary * 0.80;
        }
         else if (basicSalary <= 20000) {
            hra = basicSalary * 0.25;
            da = basicSalary * 0.90;
        } 
        else {
            hra = basicSalary * 0.30;
            da = basicSalary * 0.95;

        }

        grossSalary = basicSalary + hra + da;

        System.out.println("Salary = " + basicSalary);
        System.out.println("hra = " + hra);
        System.out.println("da = " + da);        
        System.out.println("Gross Salary = " + grossSalary);

    }
}
