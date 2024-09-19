import java.util.Scanner;

public class IT24102344Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_CUSTOMERS = 5;
        final double DISCOUNT_RATE = 0.05;

        for (int i = 1; i <= NUM_CUSTOMERS; i++) {
            System.out.print("Enter the total bill amount for customer " + i + ": ");
            double billAmount = scanner.nextDouble();
            System.out.print("Enter the mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * DISCOUNT_RATE;
                double amountToBePaid = billAmount - discount;
                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applied. Amount to be paid: " + billAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println(); // For better readability
        }

        scanner.close();
    }
}
