package Lecture2;
import java.util.Scanner;

public class VacationAdvice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter type of vacation (beach or mountain): ");
        String vacationType = scanner.nextLine().toLowerCase();
        System.out.print("Enter budget per day per person: ");
        double budget = scanner.nextDouble();

        switch (vacationType) {
            case "beach":
                if (budget < 50) {
                    System.out.println("Recommended destination: Bulgaria");
                } else {
                    System.out.println("Recommended destination: Outside Bulgaria");
                }
                break;

            case "mountain":
                if (budget < 30) {
                    System.out.println("Recommended destination: Bulgaria");
                } else {
                    System.out.println("Recommended destination: Outside Bulgaria");
                }
                break;
            default:
                System.out.println("Sorry, there is no information about this type of vacation.");
                break;
        }
        scanner.close();
    }
}
