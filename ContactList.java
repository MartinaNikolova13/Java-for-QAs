package Lection4;
import java.util.LinkedList;
import java.util.Scanner;
class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
public class ContactList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Contact> contacts = new LinkedList<>();
        int choice;

        do {
            System.out.println("\n Contacts");
            System.out.println("\n The options are");
            System.out.println("1. Add new contact");
            System.out.println("2. View all contacts");
            System.out.println("3. Remove a contact");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    contacts.add(new Contact(name, phoneNumber));
                    System.out.println("Contact is added.");
                    break;

                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts found.");
                    } else {
                        System.out.println("Contacts:");
                        int index = 1;
                        for (Contact c : contacts) {
                            System.out.println(index + ". " + c.name + " - " + c.phoneNumber);
                            index++;
                        }
                    }
                    break;

                case 3:
                    if (contacts.isEmpty()) {
                        System.out.println("Contact list is empty.");
                    } else {
                        System.out.print("Enter the name of the contact to remove: ");
                        String nameToRemove = scanner.nextLine();
                        boolean removed = contacts.removeIf(contact -> contact.name.equalsIgnoreCase(nameToRemove));
                        if (removed) {
                            System.out.println("Contact is removed.");
                        } else {
                            System.out.println("Contact not found.");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exiting Contact List.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
        scanner.close();
    }
}
