package org.example.solution.programers.lv2.p12924;

/**
 * n = target ( 1 ~ 10,000 )
 */

public class Solution_12924 {
    public int solution(int n) {
        int[] A = new int[n + 1];
        int[] S = new int[n + 1];
        int answer = 1, start = 1, end = 1;

        for (int i = 1; i <= n; i++) {
            A[i] = i;
            S[i] = S[i - 1] + i;
        }

        while (start + end < n * 2) {
            int sum = S[end] - S[start - 1];

            if (sum < n) end++;
            else if (sum > n) start++;
            else {
                answer++;
                end++;
            }
        }
        return answer;
    }
}
