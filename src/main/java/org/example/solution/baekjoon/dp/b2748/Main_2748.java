package org.example.solution.baekjoon.dp.b2748;

/**
 * 파보나치 수 2
 * 시간 1초
 *
 * N = target ( 1 ~ 90 )
 */

import java.util.*;

public class Main_2748 {
    static long[] D = new long[91];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        D[1] = 1;
        D[2] = 1;

        if (N > 2) DP(N);
        System.out.println(D[N]);
    }
    static void DP(int i) {
        if (D[i - 1] == 0) DP(i - 1);
        D[i] = D[i - 1] + D[i - 2];
    }
}
