package StringPractice20260318.DemoFiles;

import java.util.Scanner;
// Author: Mar Luis
public class AA_Advanced_VowelCount {
    static Scanner input =  new Scanner(System.in);
    static void main(String[] args) {
        System.out.print("Enter a string: ");
        String str = input.nextLine().toLowerCase();

        String[] words = str.split(" ");

        // Mar Luis: Loop through each word.
        for (String word : words) {
            int vowelCtr = 0;

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCtr++;
                }
            }
            System.out.println(word + " -> Vowels: " + vowelCtr);
        }

    }
}
