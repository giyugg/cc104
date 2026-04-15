package StringPractice20260318.DemoFiles;

public class AE_LengthAdvanced {
    static void main(String[] args) {
        String str1 = "Java"; String str2 = "  programming  ";

        if (str1.length() > 0 && str2.length() > 0) {
            System.out.println((str1.length()) + "|" + str2.length());
        }
        str1 = "";
        if (str1.length() == 0) {
            System.out.println("String is empty now: " + str1.length());
        }
    }
}
