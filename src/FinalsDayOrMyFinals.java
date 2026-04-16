import java.util.Scanner;
public class FinalsDayOrMyFinals {
    static String sentence = "";

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        sentence = input.nextLine();

        boolean terminate = false;
        while (!terminate) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = getIntegerInput();

            switch (choice) {
                case 1:
                    reverseString(sentence);
                    break;
                case 2:
                    removeLetters(sentence);
                    break;
                case 3:
                    removeSpecialCharacters(sentence);
                    break;
                case 4:
                    removeNumbers(sentence);
                    break;
                case 5:
                    normalizeSpace(sentence);
                    break;
                case 6:
                    extractWords(sentence);
                    break;
                case 18:
                    terminateProgram();
                    break;
            }
        }

    }

    public static void displayMenu() {
        System.out.println("=================================");
        System.out.println("   String Practice!!!");
        System.out.println("   Your string is: " + sentence);
        System.out.println("=================================");
        System.out.println("1. Reverse String");
        System.out.println("2. Remove Letters");
        System.out.println("3. Remove Special Characters");
        System.out.println("4. Remove Numbers");
        System.out.println("5. Normalize Spacing each Word");
        System.out.println("6. Extract Words");
        System.out.println("7. Word Count");
        System.out.println("8. Character Count");
        System.out.println("9. Check if Palindrome");
        System.out.println("10. Remove duplicated words");
        System.out.println("11. Remove duplicated characters");
        System.out.println("12. Character Compression");
        System.out.println("13. Sort");
        System.out.println("14. Alternate Two Strings");
        System.out.println("15. Replace Substring");
        System.out.println("16. Find Longest Word");
        System.out.println("17. Find Shortest Word");
        System.out.println("18. EXIT PROGRAM");
    }

    public static int getIntegerInput() {
        while (!input.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            input.next();
        }
        int var = input.nextInt();
        input.nextLine();
        return var;
    }

    public static void terminateProgram () {
        System.out.println("Program terminated.");
        System.exit(0);
    }

    public static void reverseString(String sentence) {
        System.out.println("=================================");

        System.out.println("Status: It's working!");

        String reversal = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversal = reversal + sentence.charAt(i);
        }

        System.out.println("Reversed string: " + reversal.trim());
    }

    public static void removeLetters(String sentence) {
        System.out.println("=================================");

        System.out.println("Status: It's working!");

        String removeLettersResult = "";
        for (int i = 0; i < sentence.length(); i++) {
            char letters = sentence.charAt(i);

            if (!Character.isLetter(letters)) {
                removeLettersResult = removeLettersResult + letters;
            }
        }
        System.out.println("Without letters: " + removeLettersResult.trim());
    }

    public static void removeSpecialCharacters (String sentence) {
        System.out.println("=================================");
        System.out.println("Status: Debug mode!!");


        String omitSpecialCharacters = "";
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            // keep letters, digits, and spaces
            if ((c >= 'a' && c <= 'z') ||
                    (c >= 'A' && c <= 'Z') ||
                    (c >= '0' && c <= '9') ||
                    (c == ' ')) {

                omitSpecialCharacters = omitSpecialCharacters + c;
            }
        }
        System.out.println("Result: " + omitSpecialCharacters.trim());

        System.out.println("=================================");
        String removedSpaces = sentence.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println("Thristan's Output: " + removedSpaces);
    }

    public static void removeNumbers(String sentence) {
        System.out.println("=================================");
        System.out.println("Status: It's working!");

        String omitNumbers = "";
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if ((c >= '0' && c <= '9')) {
                omitNumbers = omitNumbers + c;
            }
        }
        System.out.println("Result: " + omitNumbers.trim());
    }

    public static void normalizeSpace(String sentence){
        System.out.println("=================================");
        System.out.println("Status: It's working!");

        String normalized = sentence.trim().replaceAll("\\s+", " ");
        System.out.println("Normalized spacing: " + normalized);
    }

    public static void extractWords(String sentence) {
        System.out.println("=================================");
        System.out.println("Status: Debug mode.");

        String []wordsArray = sentence.split(" ");
        for (String word : wordsArray) {
            System.out.println(word.trim());
        }
    }
}