package GoogleKickstartRoundA2020;

import java.util.Scanner;

public class Plates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = input.nextInt();
            int K = input.nextInt();
            int P = input.nextInt();

            int[][] prefix = new int[N + 1][K + 1];

            // Read stacks and build prefix sums
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= K; j++) {
                    int value = input.nextInt();
                    prefix[i][j] = prefix[i][j - 1] + value;
                }
            }

            int[][] dp = new int[N + 1][P + 1];

            for (int i = 1; i <= N; i++) {
                for (int j = 0; j <= P; j++) {
                    dp[i][j] = dp[i - 1][j]; // take 0 plates from this stack

                    for (int x = 1; x <= K && x <= j; x++) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - x] + prefix[i][x]);
                    }
                }
            }

            System.out.println("Case #" + tc + ": " + dp[N][P]);
        }

        input.close();
    }
}
