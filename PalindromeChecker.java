package Lection5;

public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(1231));
    }
}
