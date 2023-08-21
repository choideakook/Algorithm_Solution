package org.example.solution.baekjoon.dfs_bfs.b14226;

/**
 * 이모티콘
 * 시간 2초
 *
 * S ( 2 ~ 1,000 )
 *
 * 가능한 연산
 * 복사, 붙여넣기, 하나 삭제
 */

import java.util.*;

public class Main_14226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        System.out.println(BFS(2, S));
    }
    static int BFS(int start, int end) {
        boolean[] visited = new boolean[1001];
        Queue<int[]> Q = new LinkedList<>();

        visited[start] = Q.add(new int[] {start, 2, 1});

        while (!Q.isEmpty()) {
            int[] now = Q.poll();

            if (now[0] == end) return now[1];


            if (now[0] + now[2] < 1001 && !visited[now[0] + now[2]])
                visited[now[0] + now[2]] = Q.add(
                        new int[] {now[0] + now[2], now[1] + 1, now[2]}
                );

            if (now[0] + now[0] < 1001 && !visited[now[0] + now[0]])
                visited[now[0] + now[0]] = Q.add(
                        new int[] {now[0] + now[0], now[1] + 2, now[0]}
                );

            if (now[0] - 1 > 2 && !visited[now[0] - 1])
                visited[now[0] - 1] =  Q.add(
                        new int[] {now[0] - 1, now[1] + 1, now[2]}
                );
        }
        return -1;
    }
}