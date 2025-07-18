import java.util.Scanner;

public class MarksGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physics, chemistry, biology, math, computer;
        float total, percentage;

        System.out.print("Enter marks in Physics: ");
        physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        chemistry = sc.nextInt();

        System.out.print("Enter marks in Biology: ");
        biology = sc.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        math = sc.nextInt();

        System.out.print("Enter marks in Computer: ");
        computer = sc.nextInt();

        total = physics + chemistry + biology + math + computer;
        percentage = (total / 500) * 100;

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        
    }
}
