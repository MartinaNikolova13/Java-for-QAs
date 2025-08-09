package Lection3;
public class Average {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        double average;

        for (int number : numbers) {
            sum += number;
        }

        average = (double) sum / numbers.length;

        System.out.println("Average of the numbers is: " + average);
    }
}