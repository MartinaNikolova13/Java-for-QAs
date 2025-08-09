package Lecture2;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter conversion type (CtoF or FtoC): ");
        String conversionType = scanner.nextLine().trim();

        // Perform conversion based on choice
        if (conversionType.equalsIgnoreCase("CtoF")) {
            double fahrenheit = temperature * 9 / 5 + 32;
            System.out.printf("%.2f°C is %.2f°F%n", temperature, fahrenheit);
        } else if (conversionType.equalsIgnoreCase("FtoC")) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f°F is %.2f°C%n", temperature, celsius);
        } else {
            System.out.println("Invalid conversion type. Please enter 'CtoF' or 'FtoC'.");
        }

        scanner.close();
    }
}