package Lection3;

public class FindLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 8, 23, 56, 99, 3};

        int largestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        System.out.println("The largest number in the array is: " + largestNumber);
    }
}
