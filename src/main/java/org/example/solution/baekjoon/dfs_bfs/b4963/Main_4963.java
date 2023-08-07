package org.example.solution.baekjoon.dfs_bfs.b4963;

/**
 * 섬의 개수
 * 시간 제한 1초
 * <p>
 * map ( 0 ~ 50 )
 * 1 = lnad
 * 0 = sea
 */

import java.io.*;
import java.util.*;

public class Main_4963 {
    static int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
    static int[] dy = {1, 0, -1, 0, 1, -1, 1, -1};
    static boolean[][] visited;
    static int[][] map;
    static int M, N, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        while (M + N > 0) {
            visited = new boolean[M][N];
            map = new int[M][N];
            count = 0;

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++)
                    map[i][j] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < M; i++)
                for (int j = 0; j < N; j++)
                    if (map[i][j] == 1 && !visited[i][j]) {
                        count++;
                        DFS(i, j);
                    }

            System.out.println(count);

            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }
    }
    static void DFS(int Y, int X) {
        visited[Y][X] = true;

        for (int i = 0; i < 8; i++) {
            int y = Y + dy[i];
            int x = X + dx[i];

            if (y >= 0 && x >= 0 &&
                    y < M && x < N &&
                    !visited[y][x] &&
                    map[y][x] == 1
            )
                DFS(y, x);
        }
    }
}