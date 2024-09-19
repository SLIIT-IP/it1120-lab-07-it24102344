import java.util.Scanner;

public class IT24102344Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for four subjects
        System.out.print("Enter marks for subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Enter marks for subject 4: ");
        int subject4 = scanner.nextInt();

        // Calculate average
        double average = (subject1 + subject2 + subject3 + subject4) / 4.0;

        // Determine grade
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        // Display result
        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
