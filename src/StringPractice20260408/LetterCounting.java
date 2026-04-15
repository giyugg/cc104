package StringPractice20260408;

import java.util.Scanner;

public class LetterCounting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();

        for (char letter = 'a'; letter <= 'z'; letter++) {
            int count = 0;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == letter) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(Character.toUpperCase(letter) + " = " + count);
            }
        }
    }
}