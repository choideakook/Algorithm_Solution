package org.example.solution.baekjoon.dfs_bfs.b13549;

/**
 * 숨바꼭질 3
 * 시간 2초
 *
 * N = start ( 0 ~ 100,000 )
 * M = goal ( 0 ~ 100, 000 )
 */

import java.util.*;

public class Main_13549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int max = Math.max(N, M);
        int min = Math.min(N, M) - 2;

        boolean[] visited = new boolean[max + 3];
        visited[max + 2] = true;

        Queue<int[]> Q = new LinkedList<>();
        visited[M] = Q.add(new int[]{M, 0});

        while (!Q.isEmpty()){
            int[] now = Q.poll();

            if (now[0] == N) {
                System.out.println(now[1]);
                break;
            }
            if(now[0] % 2 == 0 && !visited[now[0] / 2])
                visited[now[0]] = Q.add(new int[] {now[0] / 2, now[1]});

            if(!visited[now[0] + 1])
                visited[now[0]] = Q.add(new int[] {now[0] + 1, now[1] + 1});

            if(now[0] - 1 >= 0 && !visited[now[0] - 1] &&  now[0] >= min)
                visited[now[0]] = Q.add(new int[] {now[0] - 1, now[1] + 1});
        }
    }
}
