package Lection3;
public class FirstMultipleOfFive {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 12, 15, 22, 25, 30, 40};

        for (int number : numbers) {
            if (number % 5 == 0) {
                System.out.println("First multiple of 5 is: " + number);
                break;
            }
        }
    }
}