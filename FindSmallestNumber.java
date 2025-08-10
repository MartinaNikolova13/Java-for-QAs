package Lection5;

public class FindSmallestNumber {
    public static int findSmallestNumb(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }
    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 10;
        int num3 = 9;

        int smallest = findSmallestNumb(num1, num2, num3);
        System.out.println("The smallest number is: " + smallest);
    }
}