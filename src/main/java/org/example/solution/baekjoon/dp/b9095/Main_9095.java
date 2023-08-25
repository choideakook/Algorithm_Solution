package org.example.solution.baekjoon.dp.b9095;

/**
 * 1, 2, 3 더하기
 * 시간 1초
 *
 * N = target ( 1 ~ 10 )
 */

import java.util.*;

public class Main_9095 {
    static int[] D = new int[11];
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        D[1] = 1;
        D[2] = 2;
        D[3] = 4;

        for (int i = 0; i < T; i++) {
            N = sc.nextInt();
            if (N > 3) DP(N);
            System.out.println(D[N]);
        }
    }
    static void DP(int i){
        if (D[i - 1] == 0) DP(i - 1);
        D[i] = D[i - 1] + D[i - 2] + D[i - 3];
    }
}
