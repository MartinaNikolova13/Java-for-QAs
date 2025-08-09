package Lecture2;
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a digit between 1 and 7: ");
        int digit = scanner.nextInt();

        if (digit < 1 || digit > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
        switch (digit) {
            case 1: digit = 1; System.out.println(digit + "-st day of the week is Monday."); break;
            case 2: digit = 2; System.out.println(digit + "-nd day of the week is Tuesday."); break;
            case 3: digit = 3; System.out.println(digit + "-rd day of the week is Wednesday."); break;
            case 4: digit = 4; System.out.println(digit + "-th day of the week is Thursday."); break;
            case 5: digit = 5; System.out.println(digit + "-th day of the week is Friday."); break;
            case 6: digit = 6; System.out.println(digit + "-th day of the week is Saturday."); break;
            default: digit = 7; System.out.println(digit + "-th day of the week is Sunday."); break;
        }
    }
}
