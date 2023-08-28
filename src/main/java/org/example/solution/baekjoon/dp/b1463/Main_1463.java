package org.example.solution.baekjoon.dp.b1463;

/**
 * 1로 만들기
 * 시간 0.15 초
 *
 * N = target ( 1 ~ 10,000,000 )
 */

import java.util.*;

public class Main_1463 {
    static int[] count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        count = new int[N + 1];
        if (N > 1) DP(N);
        System.out.println(count[1]);
    }
    static void DP(int i) {
        Queue<Integer> Q = new ArrayDeque<>();
        Q.add(i);

        while (!Q.isEmpty()) {
            int now = Q.poll();
            if (now == 1) break;

            if (now % 3 == 0 && count[now / 3] == 0) {
                count[now / 3] = count[now] + 1;
                Q.add(now / 3);
            }
            if (now % 2 == 0 && count[now / 2] == 0) {
                count[now / 2] = count[now] + 1;
                Q.add(now / 2);
            }
            if (now - 1 > 0 && count[now - 1] == 0) {
                count[now - 1] = count[now] + 1;
                Q.add(now - 1);
            }
        }
    }
}