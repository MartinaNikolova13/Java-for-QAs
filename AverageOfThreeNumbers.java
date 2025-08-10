package Lection5;

public class AverageOfThreeNumbers {
    public static double computeAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        double average = computeAverage(number1, number2, number3);
        System.out.println("The average is: " + average);
    }
}
