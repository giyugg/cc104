package Prof_2DArrayDemo;

public class Main {
    public static void main(String[] args) {
        int [][] arr = new int [2][2];

        // add elements
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
        add(arr);
        update(arr,1,0,55);
        retrieveLoop(arr);
//        showEvenNumbers(arr);
    }

    static void add(int[][] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = row + col;
            }
        }
    }
    static void update(int[][] arr, int r, int c, int val){
        if(r >= 0 && r < arr.length && c >= 0 && c < arr.length) {
            arr[r][c] = val;
        } else {
            System.out.println("Invalid Indices.");
        }
    }
    static void retrieveLoop(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
        }
    }

//    static void showEvenNumbers(int[][] arr){
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col] % 2 == 0){
//                    System.out.println(arr[row][col]);
//                }
//
//            }
//        }
//    }
}
