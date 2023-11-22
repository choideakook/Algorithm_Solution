package org.example.solution.baekjoon.dfs_bfs.b1697;

/**
 * 숨바꼭질
 * 시간 2초
 * N = start ( 0 - 100,000 )
 * K = end ( 0 - 100,000 )
 * 걷기 = + 1 , - 1
 * 순간 이동 = * 2
 */

import java.util.*;

public class Main_1697 {
    static int[] visit = new int[100001];
    static Queue<Integer> Q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Q.offer(K);

        while (!Q.isEmpty()) {
            Integer now = Q.poll();

            if (now == N) {
                System.out.println(visit[now]++);
                return;
            }
            int min = now - 1;
            int mul = now / 2;
            int add = now + 1;

            if (min >= 0 && visit[min] == 0) move(min, now);
            if (now % 2 == 0 && mul != 0 && visit[mul] == 0) move(mul, now);
            if (add < 100001 && visit[add] == 0) move(add, now);
        }
    }

    private static void move(int min, Integer now) {
        visit[min] = visit[now] + 1;
        Q.add(min);
    }
}