package StringPractice20260318.ChatGPT_Practices.StringArrayPrac;

import java.util.Scanner;

public class Practice8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();

        int[] letterCount = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                letterCount[ch - 'a']++;
            }
        }

        int max = 0;
        char mostLetter = ' ';

        for (int i = 0; i < letterCount.length; i++) {
            if (letterCount[i] > max) {
                max = letterCount[i];
                mostLetter = (char) (i + 'a');
            }
        }

        System.out.println("Most frequent letter: " + Character.toUpperCase(mostLetter));
        System.out.println("Number of times: " + max);
    }
}
