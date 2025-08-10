package Lection4;
import java.util.Scanner;
import java.util.Stack;
public class BooksManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> bookStack = new Stack<>();
        int choice;

        do {
            // Menu
            System.out.println("\n Stack of Books");
            System.out.println("1. Add a new book to the stack");
            System.out.println("2. View the top book");
            System.out.println("3. Remove the top book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the book title: ");
                    String bookTitle = scanner.nextLine();
                    bookStack.push(bookTitle);
                    System.out.println("\"" + bookTitle + "\" has been added to the stack.");
                    break;
                case 2:
                    if (bookStack.isEmpty()) {
                        System.out.println("The book stack is empty.");
                    } else {
                        System.out.println("Top book: \"" + bookStack.peek() + "\"");
                    }
                    break;
                case 3:
                    if (bookStack.isEmpty()) {
                        System.out.println("The book stack is already empty.");
                    } else {
                        String removedBook = bookStack.pop();
                        System.out.println("\"" + removedBook + "\" has been removed from the stack.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting Book Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
        scanner.close();
    }
}
