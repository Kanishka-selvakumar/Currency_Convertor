import java.util.Scanner;

public class currencyconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fixed exchange rates
        double usdToInr = 82.75;
        double inrToUsd = 1 / usdToInr;
        double usdToEur = 0.91;
        double eurToUsd = 1 / usdToEur;

        System.out.println("Welcome to Currency Converter");
        System.out.println("Select conversion type:");
        System.out.println("1: USD to INR");
        System.out.println("2: INR to USD");
        System.out.println("3: USD to EUR");
        System.out.println("4: EUR to USD");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0;

        switch(choice) {
            case 1:
                convertedAmount = amount * usdToInr;
                System.out.printf("%.2f USD = %.2f INR\n", amount, convertedAmount);
                break;
            case 2:
                convertedAmount = amount * inrToUsd;
                System.out.printf("%.2f INR = %.2f USD\n", amount, convertedAmount);
                break;
            case 3:
                convertedAmount = amount * usdToEur;
                System.out.printf("%.2f USD = %.2f EUR\n", amount, convertedAmount);
                break;
            case 4:
                convertedAmount = amount * eurToUsd;
                System.out.printf("%.2f EUR = %.2f USD\n", amount, convertedAmount);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}