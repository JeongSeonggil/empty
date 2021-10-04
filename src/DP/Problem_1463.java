package DP;
import java.util.Scanner;
public class Problem_1463 {
        static Integer[] dp;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();
            dp = new Integer[value + 1];
            dp[0] = dp[1] = 0;

            System.out.println(count(value));



        }
        static int count(int value) {
            if (dp[value] == null) {
                if (value % 6 == 0) {
                    dp[value] = Math.min(count(value - 1), Math.min(count(value / 3), count(value / 2))) + 1;

                } else if (value % 3 == 0) {
                    dp[value] = Math.min(count(value / 3), count(value - 1)) + 1;

                } else if (value % 2 == 0) {
                    dp[value] = Math.min(count(value / 2), count(value - 1)) + 1;

                } else {
                    dp[value] = count(value - 1) + 1;
                }


            }
            return dp[value];
        }

}
