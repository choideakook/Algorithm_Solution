package org.example.solution.baekjoon.dp.b11726;

/**
 * 2 * N 타일 채우기
 * 시간 1초
 *
 * N = length ( 1 ~ 1,000 )
 */

import java.util.*;

public class Main_11726 {
    static int[] D;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        D = new int[N];
        if (N > 1)
            D[1] = 2;
        D[0] = 1;

        if (N > 2) DP(N - 1);
        System.out.println(D[N - 1] % 10007);
    }
    static void DP(int index) {
        if (D[index - 1] == 0)
            DP(index - 1);

        D[index] = D[index - 1] + D[index - 2];
    }
}
