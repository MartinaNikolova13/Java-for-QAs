package Lection4;
import java.util.Scanner;
import java.util.Stack;
public class BookRetriever {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> bookStack = new Stack<>();

        System.out.println("Enter five book titles to add to the stack (top book first):");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Book " + i + ": ");
            String bookTitle = scanner.nextLine();
            bookStack.push(bookTitle);
        }
        System.out.print("\nEnter the title of the book to retrieve: ");
        String targetBook = scanner.nextLine();
        Stack<String> tempStack = new Stack<>();
        boolean found = false;
        while (!bookStack.isEmpty()) {
            String topBook = bookStack.pop();
            if (topBook.equalsIgnoreCase(targetBook)) {
                System.out.println("\n Book \"" + topBook + "\" is retrieved!");
                found = true;
                break;
            } else {
                tempStack.push(topBook);
            }
        }
        if (!found) {
            System.out.println("\n Book \"" + targetBook + "\" is not found in the stack.");
        }
        while (!tempStack.isEmpty()) {
            bookStack.push(tempStack.pop());
        }

        System.out.println("\n Remaining books in the stack:");
        if (bookStack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            for (int i = bookStack.size() - 1; i >= 0; i--) {
                System.out.println("- " + bookStack.get(i));
            }
        }
        scanner.close();
    }
}
