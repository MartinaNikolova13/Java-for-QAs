package Lecture1;
import java.util.Scanner;
public class ConvertProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        int minutesInDay = 60 * 24;
        int minutesInYear = minutesInDay * 365;

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;
        System.out.println(minutes + " minutes is " + years + " years and " + days + " days.");
        scanner.close();
    }
}
