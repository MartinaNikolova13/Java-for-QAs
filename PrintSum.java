package Lection4;

public class PrintSum {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 8, 13, 22, 25};

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements is: " + sum);
    }
}
