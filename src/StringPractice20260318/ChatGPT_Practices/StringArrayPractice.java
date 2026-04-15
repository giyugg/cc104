package StringPractice20260318.ChatGPT_Practices;
import java.util.Scanner;
public class StringArrayPractice {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Uncomment ONLY ONE activity at a time.

        // =========================================
        // Activity 1: Split Sentence into Words
        // =========================================
        /*
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("Words in the sentence:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("Total words: " + words.length);
        */

        // =========================================
        // Activity 2: Convert Word into Character Array
        // =========================================
        /*
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        char[] letters = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
        }

        System.out.println("Characters in the word:");
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

        System.out.println("Total characters: " + letters.length);
        */

        // =========================================
        // Activity 3: Find the Longest Word
        // =========================================
        /*
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());
        */

        // =========================================
        // Activity 4: Count Vowels Using Character Array
        // =========================================
        /*
        System.out.print("Enter a word or sentence: ");
        String text = input.nextLine().toLowerCase();

        char[] letters = new char[text.length()];
        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++) {
            letters[i] = text.charAt(i);

            if (letters[i] == 'a' || letters[i] == 'e' ||
                letters[i] == 'i' || letters[i] == 'o' ||
                letters[i] == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Total vowels: " + vowelCount);
        */

        // =========================================
        // Activity 5: Store 5 Names in an Array
        // =========================================
        /*
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        System.out.println("\nFormatted names:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i].toUpperCase());
            System.out.println("First character: " + names[i].charAt(0));
            System.out.println("Length: " + names[i].length());
            System.out.println();
        }
        */

        input.close();
    }
}
