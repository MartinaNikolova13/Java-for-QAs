package Lection4;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> customerQueue = new LinkedList<>();
        int choice;
        do {
            // Menu
            System.out.println("\n Welcome to the Coffee shop");
            System.out.println("1. Add customer to line");
            System.out.println("2. Serve next customer");
            System.out.println("3. View current line");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter customer's name: ");
                    String name = scanner.nextLine();
                    customerQueue.add(name);
                    System.out.println(name + " has been added to the line.");
                    break;
                case 2:
                    if (customerQueue.isEmpty()) {
                        System.out.println("No customers in line to serve.");
                    } else {
                        String servedCustomer = customerQueue.poll();
                        System.out.println("Serving " + servedCustomer + ". Enjoy your coffee!");
                    }
                    break;

                case 3:
                    if (customerQueue.isEmpty()) {
                        System.out.println("The line is currently empty.");
                    } else {
                        System.out.println("Current line of customers:");
                        int pos = 1;
                        for (String customer : customerQueue) {
                            System.out.println(pos + ". " + customer);
                            pos++;
                        }
                    }
                    break;

                case 0:
                    System.out.println("Closing coffee shop queue. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        scanner.close();
    }
}
