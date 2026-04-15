package StringPractice20260318.ChatGPT_Practices.StringMethods;
import java.util.Scanner;
public class Practice2 {
    static void main(String[] args) {
        // Activity 2: Compare Two Strings
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String str1 = input.nextLine();

        System.out.print("Enter second word: ");
        String str2 = input.nextLine();

        System.out.println("equals(): " + str1.equals(str2));
        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));

    }
}
