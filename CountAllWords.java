package Lection5;

public class CountAllWords {
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String text1 = "Hello!";
        String text2 = "I am a Manual QA.";
        String text3 = "I am an Automation QA";
        String text4 = "   ";

        System.out.println("Word count: " + countWords(text1));
        System.out.println("Word count: " + countWords(text2));
        System.out.println("Word count: " + countWords(text3));
        System.out.println("Word count: " + countWords(text4));
    }
}