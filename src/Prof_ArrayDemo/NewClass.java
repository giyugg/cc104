package Prof_ArrayDemo;

import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int size = sc.nextInt();
        int[] numsArr = new int[size];
        for(int idx = 0; idx < numsArr.length;idx++){
            numsArr[idx] = idx * 2;
        }
        displayArr(numsArr);
        System.out.print("Enter pos: ");
        int pos = sc.nextInt();
        sc.close();
        updateArr(pos,numsArr);
        displayArr(numsArr);
        deleteArr(numsArr);
        displayArr(numsArr);
    }
    static void updateArr(int pos, int []numsArr){
        int newValue = 555;
        numsArr[pos] = newValue;
    }
    static void displayArr(int []numsArr){
        for (int element: numsArr){
            if(element!=0){
                System.out.println(element);
            }
        }
    }
    static int [] deleteArr( int []numsArr){
        for(int idx = 0; idx <= numsArr.length-1;idx++){
            if(numsArr[idx] > 9){
                numsArr[idx] = 0;
            }
        }
        return numsArr;
    }
}
