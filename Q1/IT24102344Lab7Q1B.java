import java.util.Scanner;

public class IT24102344Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter marks for 4 subjects for student " + i + " (separated by space): ");
            int subject1 = scanner.nextInt();
            int subject2 = scanner.nextInt();
            int subject3 = scanner.nextInt();
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
            System.out.println("Student " + i + " - Average marks: " + average + ", Grade: " + grade);
        }

        scanner.close();
    }
}
