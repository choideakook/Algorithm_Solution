package org.example.solution.programers.lv2.p12900;

/**
 * 2 x n 타일링
 * n ( 1 ~ 60,000 )
 */

public class Solution_12900 {
    int[] dp;
    int div = 1000000007;
    public int solution(int n) {
        dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        DP(n);
        return dp[n];
    }

    void DP(int n) {
        if (dp[n - 1] == 0) DP(n - 1);
        dp[n] = (dp[n - 1] % div) + (dp[n - 2] % div);
    }
}
