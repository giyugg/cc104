package StringPractice20260318.ChatGPT_Practices.StringMethods;

import java.util.Scanner;

public class Practice1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Activity 1: Word Analyzer
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        System.out.println("Length: " + word.length());
        System.out.println("First char: " + word.charAt(0));
        System.out.println("Last char: " + word.charAt(word.length() - 1));
    }
}
