package Lection3;

public class SkipMultiplesOfThree {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 7, 21, 25, 30, 33, 40};
        System.out.println("Numbers, excluding multiples of 3:");
        for (int number : numbers) {
            if (number % 3 == 0) {
                continue;
            }
            System.out.print(number + " ");
        }
    }
}
