package StringPractice20260318.ChatGPT_Practices.StringArrayPrac;

import java.util.Scanner;

public class Practice6 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("Words in the sentence:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("Total words: " + words.length);
    }
}