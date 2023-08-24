package org.example.solution.baekjoon.dp.b11726;

/**
 * 2 * N 타일 채우기
 * 시간 1초
 * <p>
 * N = length ( 1 ~ 1,000 )
 */

import java.util.*;

public class Main_11726 {
    static long[] D = new long[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() - 1;
        D[0] = 1;
        D[1] = 2;

        if (N > 1) DP(N);
        System.out.println(D[N]);
    }
    static void DP(int index) {
        if (D[index - 1] == 0)
            DP(index - 1);

        D[index] = (D[index - 1] + D[index - 2]) % 10007;
    }
}
