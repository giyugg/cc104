package StringPractice20260318.ChatGPT_Practices.StringMethods;

import java.util.Scanner;

public class Practice4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Activity 4: Split Words
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}