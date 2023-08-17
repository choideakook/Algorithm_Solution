package org.example.solution.baekjoon.dfs_bfs.b1743;

/**
 * 음식물 피하기
 * 시간 2초
 *
 * N = Y / M = X ( 1 ~ 100 )
 * K = target ( 1 ~ N * M )
 */

import java.util.*;
import java.io.*;

public class Main_1743 {
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static boolean[][] visited;
    static int N, M, K, count, result;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()) - 1;
            int C = Integer.parseInt(st.nextToken()) - 1;
            visited[R][C] = true;
        }

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (visited[i][j]) {
                    count = 0;
                    DFS(i, j);
                    if (result < count) result = count;
                }
        System.out.println(result);
    }
    static void DFS(int i, int j) {
        visited[i][j] = false;
        count++;

        for (int k = 0; k < 4; k++) {
            int Y = i + dy[k];
            int X = j + dx[k];

            if (
                    Y >= 0 && X >= 0 &&
                    Y < N && X < M &&
                    visited[Y][X]
            )DFS(Y, X);
        }
    }
}
