package org.example.solution.programers.lv2.p12900;

/**
 * 2 x n 타일링
 * n ( 1 ~ 60,000 )
 */

public class Solution_12900 {
    public int solution(int n) {
        int div = 1000000007;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++)
            dp[i] = (dp[i - 1] + dp[i - 2]) % div;
        return dp[n];
    }
}
