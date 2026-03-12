package Practice2DArray20260312;
// Create a 3×3 integer array and print all elements using nested loops.
public class twoDimensionArrayPractice {
    static void main(String[] args) {
        int[][] numbers = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.print(numbers[row][column] + " ");
            } System.out.println();
        }
    }
}