package ActivityArray20260312;
import java.util.Scanner;
public class HighestValue {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int valueSize =  input.nextInt();

        input.nextLine();
        System.out.print("Enter " + valueSize + " elements: ");
        String stringEl = input.nextLine();

        String[] stringArray = stringEl.split(" ");

        // Pure lesson thinking about this shit.
        // Structure of String to Int conversion.
        int[] myArray = new int[valueSize];
        int idx = 0;

        for (String el : stringArray) {
            myArray[idx] = Integer.parseInt(el);
            idx++;
        }
        // Structure of highest value.
        int max = myArray[0];
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] > max) {
                max = myArray[index];
            }
        } System.out.println("The highest value is " + max);

        // AI Generated for learning purposes only.
        // Structure of Highest Unique Number.
        int uniqueMax = Integer.MIN_VALUE;

        for (int k : myArray) {
            int ctr = 0;

            for (int i : myArray) {
                if (k == i) {
                    ctr++;
                }
            }

            if (ctr == 1 && k > uniqueMax) {
                uniqueMax = k;
            }
        }
        /* This block can be only:
        System.out.println("The highest unique value is " + uniqueMax);
        But there is no error to show when no unique value is being read, but will print -2147483648.
        Just an optional hotfix.*/
        if (uniqueMax == Integer.MIN_VALUE) {
            System.out.println("The highest unique value is: None");
        } else {
            System.out.println("The highest unique value is " + uniqueMax);
        }

        // AI Generated for learning purposes only.
        // Structure of 2nd Highest Unique Number.

        int firstUnique = Integer.MIN_VALUE;
        int secondUnique = Integer.MIN_VALUE;

        for (int k : myArray) {
            int ctr = 0;
            for (int i : myArray) {
                if (k == i) {
                    ctr++;
                }
            }
            // AI Note: Only consider unique values.
            if (ctr == 1) {
                if (k > firstUnique) {
                    secondUnique = firstUnique;
                    firstUnique = k;
                } else if (k > secondUnique && k != firstUnique) {
                    secondUnique = k;
                }
            }
        }
        /* Again, this block can be only:
        System.out.println("2nd Highest Unique no.: " + secondUnique);
        But there is no error to show when no unique value is being read, but will print -2147483648.
        Just an optional hotfix.*/
        if (secondUnique == Integer.MIN_VALUE) {
            System.out.println("2nd Highest Unique no.: None");
        } else {
            System.out.println("2nd Highest Unique no.: " + secondUnique);
        }
    }
}