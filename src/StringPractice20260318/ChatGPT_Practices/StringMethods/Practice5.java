package StringPractice20260318.ChatGPT_Practices.StringMethods;

import java.util.Scanner;

public class Practice5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Activity 5: Search and Change Text
        System.out.print("Enter text: ");
        String text = input.nextLine();

        System.out.println("Index of 'a': " + text.indexOf('a'));
        System.out.println("Replaced: " + text.replace('a', '@'));

        if (text.length() >= 3) {
            System.out.println("Substring from index 2: " + text.substring(2));
        } else {
            System.out.println("Text is too short for substring(2).");
        }
    }
}
