package StringPractice20260318.ChatGPT_Practices.StringArrayPrac;

import java.util.Scanner;

public class Practice8 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
    }
}
