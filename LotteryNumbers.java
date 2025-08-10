package Lection4;
import java.util.ArrayList;
import java.util.Scanner;
public class LotteryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> winningNumbers = new ArrayList<>();
        int choice;

        do {
            // Menu
            System.out.println("\n Lottery Numbers");
            System.out.println("1. Add winning number");
            System.out.println("2. View all winning numbers");
            System.out.println("3. Check if a number is a winning number");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter winning number to add: ");
                    int newNumber = scanner.nextInt();
                    if (winningNumbers.contains(newNumber)) {
                        System.out.println("This number is already in the list.");
                    } else {
                        winningNumbers.add(newNumber);
                        System.out.println("Winning number is added.");
                    }
                    break;

                case 2:
                    if (winningNumbers.isEmpty()) {
                        System.out.println("No winning numbers recorded yet.");
                    } else {
                        System.out.println("Winning numbers:");
                        for (int number : winningNumbers) {
                            System.out.print(number + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter the number to check: ");
                    int checkNumber = scanner.nextInt();
                    if (winningNumbers.contains(checkNumber)) {
                        System.out.println("Congratulations! " + checkNumber + " is a winning number!");
                    } else {
                        System.out.println("Sorry, " + checkNumber + " is not a winning number.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting Lottery.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
    }
}
