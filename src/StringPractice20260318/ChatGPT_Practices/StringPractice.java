package StringPractice20260318.ChatGPT_Practices;
import java.util.Scanner;
public class StringPractice {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pick ONE activity at a time and run it.

        // Activity 1: Word Analyzer
        /*
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        System.out.println("Length: " + word.length());
        System.out.println("First char: " + word.charAt(0));
        System.out.println("Last char: " + word.charAt(word.length() - 1));
        */

        // Activity 2: Compare Two Strings
        /*
        System.out.print("Enter first word: ");
        String str1 = input.nextLine();

        System.out.print("Enter second word: ");
        String str2 = input.nextLine();

        System.out.println("equals(): " + str1.equals(str2));
        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));
        */

        // Activity 3: Clean and Convert Text
        /*
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        System.out.println("Original: [" + text + "]");
        System.out.println("Trimmed: [" + text.trim() + "]");
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        */

        // Activity 4: Split Words
        /*
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
        */

        // Activity 5: Search and Change Text
        /*
        System.out.print("Enter text: ");
        String text = input.nextLine();

        System.out.println("Index of 'a': " + text.indexOf('a'));
        System.out.println("Replaced: " + text.replace('a', '@'));

        if (text.length() >= 3) {
            System.out.println("Substring from index 2: " + text.substring(2));
        } else {
            System.out.println("Text is too short for substring(2).");
        }
        */

        input.close();
    }
}
