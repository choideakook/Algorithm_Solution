package org.example.solution.baekjoon.dp.b11050;

/**
 * 이항 계수 1
 * 시간 1초
 * <p>
 * N = length ( 1 ~ 10 )
 * K = pick ( 0 ~ N )
 */

import java.util.*;

public class Main_11050 {
    static int[][] D;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (K == 0)
            System.out.println(0);
        else if (N == K)
            System.out.println(1);
        else {
            D = new int[N + 1][K + 1];
            for (int i = 1; i <= N; i++) D[i][1] = i;
            for (int i = 1; i <= K; i++) D[i][i] = 1;
            if (N > 1 && K > 1) DP(N, K);

            System.out.println(D[N][K]);
        }
    }
    static void DP(int n, int k) {
        if (D[n - 1][k] == 0) DP(n - 1, k);
        if (D[n - 1][k - 1] == 0) DP(n - 1, k - 1);
        D[n][k] = D[n - 1][k] + D[n - 1][k - 1];
    }
}
