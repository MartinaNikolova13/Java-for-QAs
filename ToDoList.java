package Lection4;
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    boolean isCompleted;
    Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }
}
public class ToDoList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Task> tasks = new ArrayList<>();
            int choice;

            do {
                System.out.println("\nToDo LIST");
                System.out.println("1. Add new task");
                System.out.println("2. Mark task as completed");
                System.out.println("3. Remove completed tasks");
                System.out.println("4. Display current tasks");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        tasks.add(new Task(description));
                        System.out.println("Task added.");
                        break;

                    case 2:
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks to mark as completed.");
                        } else {
                            System.out.println("Enter task number to mark as completed:");
                            displayTasks(tasks);
                            int indexToMark = scanner.nextInt();
                            if (indexToMark >= 1 && indexToMark <= tasks.size()) {
                                tasks.get(indexToMark - 1).isCompleted = true;
                                System.out.println("Task marked as completed.");
                            } else {
                                System.out.println("Invalid task number.");
                            }
                        }
                        break;

                    case 3:
                        tasks.removeIf(task -> task.isCompleted);
                        System.out.println("Completed tasks removed.");
                        break;

                    case 4:
                        displayTasks(tasks);
                        break;

                    case 0:
                        System.out.println("Exiting ToDo List App.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 0);

            scanner.close();
        }
        private static void displayTasks(ArrayList<Task> tasks) {
            if (tasks.isEmpty()) {
                System.out.println("No tasks found.");
                return;
            }

            System.out.println("\nCurrent Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                Task t = tasks.get(i);
                String status = t.isCompleted ? "[Completed]" : "[Pending]";
                System.out.println((i + 1) + ". " + t.description + " " + status);
            }
        }
}
