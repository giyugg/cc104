package GoogleKickstartRoundA2020;

import java.util.Arrays;
import java.util.Scanner;

public class Allocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = input.nextInt();
            int B = input.nextInt();

            int[] houses = new int[N];

            for (int i = 0; i < N; i++) {
                houses[i] = input.nextInt();
            }

            Arrays.sort(houses);

            int count = 0;
            int sum = 0;

            for (int i = 0; i < N; i++) {
                if (sum + houses[i] <= B) {
                    sum += houses[i];
                    count++;
                } else {
                    break;
                }
            }

            System.out.println("Case #" + tc + ": " + count);
        } input.close();
    }
}