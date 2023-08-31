package org.example.solution.programers.lv2.p12945;

/**
 * n = target ( 2 ~ 100,000 )
 */

public class Solution_12945 {
    long[] D;
    public long solution(int n) {
        D = new long[n + 1];
        D[1] = 1;
        D[2] = 1;

        if (n > 2) DP(n);
        return D[n];
    }
    void DP(int n) {
        if (D[n - 1] == 0) DP(n - 1);
        D[n] = D[n - 1] + D[n - 2];
    }
}
