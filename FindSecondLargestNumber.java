package Lection5;

public class FindSecondLargestNumber {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array should contain at least two elements.");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("No second largest element found (all elements may be equal).");
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 35, 20, 55, 40};

        try {
            int secondLargest = findSecondLargest(numbers);
            System.out.println("Second largest number is: " + secondLargest);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
