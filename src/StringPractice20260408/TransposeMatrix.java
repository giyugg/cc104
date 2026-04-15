package StringPractice20260408;
import java.util.Scanner;
public class TransposeMatrix {
    static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int[][] matrix = new int[2][3];

        System.out.println("Enter 6 elements of a 2x3 matrix: ");
        for (int ctr1 = 0; ctr1 < 2; ctr1++) {
            for (int ctr2 = 0; ctr2 < 3; ctr2++) {
                matrix[ctr1][ctr2] = value.nextInt();
            }
        }
        System.out.println("--- ORIGINAL MATRIX ---");
        for (int ctr1 = 0; ctr1 < 2; ctr1++) {
            for (int ctr2 = 0; ctr2 < 3; ctr2++) {
                System.out.print(matrix[ctr1][ctr2] + " ");
            }
            System.out.println();
        }

        System.out.println("--- TRANSPOSED MATRIX ---");
        for (int ctr2 = 0; ctr2 < 3; ctr2++) {
            for (int ctr1 = 0; ctr1 < 2; ctr1++) {
                System.out.print(matrix[ctr1][ctr2] + " ");
            }
            System.out.println();
        }
    }
}
