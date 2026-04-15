package StringPractice20260318.ChatGPT_Practices.StringArrayPrac;

import java.util.Scanner;

public class Practice7 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
    }
}
