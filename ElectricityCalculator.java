import java.util.Scanner;

public class ElectricityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter electricity units consumed (kWh): ");
        double units = scanner.nextDouble();

        double bill = 0;
        double serviceFee = 50.0;

        if (units <= 150) {
            bill = units * 3.50;
        } else if (units <= 400) {
            bill = (150 * 3.50) + ((units - 150) * 4.20);
        } else {
            bill = (150 * 3.50) + (250 * 4.20) + ((units - 400) * 5.00);
        }

        double totalAmount = bill + serviceFee;

        System.out.println("------------------------------------");
        System.out.println("Electricity Consumption: " + units + " kWh");
        System.out.printf("Base Electricity Cost: %.2f Baht\n", bill);
        System.out.println("Service Fee: " + serviceFee + " Baht");
        System.out.println("------------------------------------");
        System.out.printf("Total Amount to Pay: %.2f Baht\n", totalAmount);
        System.out.println("------------------------------------");

        scanner.close();
    }
}
