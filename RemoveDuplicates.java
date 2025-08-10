package Lection5;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        int[] uniqueArray = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            uniqueArray[i++] = num;
        }
        return uniqueArray;
    }
    public static void main(String[] args) {
        int[] original = {5, 1, 3, 3, 2, 1, 4, 3};
        int[] unique = removeDuplicates(original);

        System.out.println("Original array: " + Arrays.toString(original));
        System.out.println("Unique array: " + Arrays.toString(unique));
    }
}
