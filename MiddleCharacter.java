package Lection5;

public class MiddleCharacter {
    public static void displayMiddleCharacter(String input) {
        int length = input.length();
        int middle = length / 2;

        if (length == 0) {
            System.out.println("The string is empty.");
        } else if (length % 2 == 0) {
            System.out.println("Middle characters: " + input.charAt(middle - 1) + input.charAt(middle));
        } else {
            System.out.println("Middle character: " + input.charAt(middle));
        }
    }
    public static void main(String[] args) {
        displayMiddleCharacter("hi");
        displayMiddleCharacter("testing");
        displayMiddleCharacter("Java");
        displayMiddleCharacter("QA");
        displayMiddleCharacter("");
    }
}
