package DP;

import java.util.Scanner;
public class Problem_11057 {
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][10];

        dp[1][0] = dp[1][1] = dp[1][2] = dp[1][3] = dp[1][4] = dp[1][5] = dp[1][6] = dp[1][7] = dp[1][8] = dp[1][9] = 1;
        // n = 1일때 의 값 초기화

        for(int i = 2; i < n+1; i++){
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < j + 1; k++){
                    dp[i][j] += dp[i-1][k];
                }
                dp[i][j] %= 10007;
            }

        }
        int sum = 0;
        for (int i = 0; i < 10; i++){
            sum += dp[n][i];
        }
        System.out.println(sum % 10007);
    }

}
