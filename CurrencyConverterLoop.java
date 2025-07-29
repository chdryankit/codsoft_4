import java.util.Scanner;

public class CurrencyConverterLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usdToInr = 83.10;
        double eurToInr = 90.25;

        System.out.println("=== Currency Converter ===");

        while (true) {
            System.out.println("\n1. USD to INR");
            System.out.println("2. INR to USD");
            System.out.println("3. EUR to INR");
            System.out.println("4. INR to EUR");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using the converter!");
                break;
            }

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            double converted = 0;

            switch (choice) {
                case 1:
                    converted = amount * usdToInr;
                    System.out.println(amount + " USD = " + converted + " INR");
                    break;
                case 2:
                    converted = amount / usdToInr;
                    System.out.println(amount + " INR = " + converted + " USD");
                    break;
                case 3:
                    converted = amount * eurToInr;
                    System.out.println(amount + " EUR = " + converted + " INR");
                    break;
                case 4:
                    converted = amount / eurToInr;
                    System.out.println(amount + " INR = " + converted + " EUR");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}