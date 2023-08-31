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
        int rest = 1234567;

        for (int i = 3; i <= n; i++)
            D[i] = (D[i - 1] % rest)  + (D[i - 2] % rest);
        return D[n];
    }
}
