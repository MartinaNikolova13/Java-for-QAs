package Lection5;

public class LastCharacterDisplay {
    public static void displayLastCharacter(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("The string is empty. There is no last character.");
        } else {
            char lastChar = input.charAt(input.length() - 1);
            System.out.println("The last character is: " + lastChar);
        }
    }
    public static void main(String[] args) {
        displayLastCharacter("I");
        displayLastCharacter("am");
        displayLastCharacter("qa");
        displayLastCharacter(null);
    }
}
