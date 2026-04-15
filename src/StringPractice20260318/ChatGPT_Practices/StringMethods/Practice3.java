package StringPractice20260318.ChatGPT_Practices.StringMethods;

import java.util.Scanner;

public class Practice3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Activity 3: Clean and Convert Text
        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        System.out.println("Original: [" + text + "]");
        System.out.println("Trimmed:  [" + text.trim() + "]");
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
    }

}
