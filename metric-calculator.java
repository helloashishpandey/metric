import java.util.Scanner;

public class MetricCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Metric Calculator!");
        System.out.println("1. Convert meters to centimeters");
        System.out.println("2. Convert grams to kilograms");
        System.out.println("3. Convert milliliters to liters");
        System.out.print("Please enter your choice (1-3): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                convertMetersToCentimeters();
                break;
            case 2:
                convertGramsToKilograms();
                break;
            case 3:
                convertMillilitersToLiters();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private static void convertMetersToCentimeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length in meters: ");
        double meters = scanner.nextDouble();
        double centimeters = meters * 100;
        System.out.println(meters + " meters is equal to " + centimeters + " centimeters");
    }

    private static void convertGramsToKilograms() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight in grams: ");
        double grams = scanner.nextDouble();
        double kilograms = grams / 1000;
        System.out.println(grams + " grams is equal to " + kilograms + " kilograms");
    }

    private static void convertMillilitersToLiters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the volume in milliliters: ");
        double milliliters = scanner.nextDouble();
        double liters = milliliters / 1000;
        System.out.println(milliliters + " milliliters is equal to " + liters + " liters");
    }
}
