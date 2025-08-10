package Lection4;

public class FindBiggestElement {
    public static void main(String[] args) {
        int[] array = {15, 17, 3, 9, 27, 65};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The biggest element in the array is: " + max);
    }
}
