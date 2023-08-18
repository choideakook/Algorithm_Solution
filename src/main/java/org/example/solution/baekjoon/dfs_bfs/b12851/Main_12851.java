package org.example.solution.baekjoon.dfs_bfs.b12851;

/**
 * 숨바꼭질 2
 * 시간 2초
 *
 *  N = start ( 0 ~ 100,000 )
 *  K = goal ( 0 ~ 100,000 )
 */

import java.util.*;

public class Main_12851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0, count = 0;
        int N = sc.nextInt();
        int K = sc.nextInt();

        int max = Math.max(N, K);
        int min = Math.min(N, K) - 2;

        boolean[] visited = new boolean[max + 3];
        visited[max + 2] = true;

        Queue<int[]> Q = new LinkedList<>();
        int[] now = {K, 0};
        Q.add(now);

        while (!Q.isEmpty()){
            now = Q.poll();
            visited[now[0]] = true;

            if (count > 0 && answer < now[1]) break;

            if (now[0] == N) {
                if (answer == 0) answer = now[1];

                count++;
                visited[now[0]] = false;
                continue;
            }
            if(now[0] % 2 == 0 && !visited[now[0] / 2])
                Q.add(new int[] {now[0] / 2, now[1] + 1});
            if(now[0] - 1 > min && now[0] - 1 >= 0 && !visited[now[0] - 1])
                Q.add(new int[] {now[0] - 1, now[1] + 1});
            if(!visited[now[0] + 1])
                Q.add(new int[] {now[0] + 1, now[1] + 1});
        }
        System.out.println(answer + "\n" + count);
    }
}
