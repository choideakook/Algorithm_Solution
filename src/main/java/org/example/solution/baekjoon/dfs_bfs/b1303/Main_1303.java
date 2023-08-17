package org.example.solution.baekjoon.dfs_bfs.b1303;

/**
 * 전쟁 - 전투
 * 시간 2초
 *
 * N = X / M = Y ( 1 ~ 100 )
 */

import java.util.*;

public class Main_1303 {
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static boolean[][] visited;
    static char[][] map;
    static int M, N, W, B, result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[M][N];
        map = new char[M][N];

        for (int i = 0; i < M; i++) {
            char[] cha = sc.next().toCharArray();

            for (int j = 0; j < N; j++)
                map[i][j] = cha[j];
        }

        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                if (!visited[i][j]) {
                    result = 0;
                    DFS(i, j);

                    if (map[i][j] == 'W')
                        W += result * result;
                    else
                        B += result * result;
                }
        System.out.println(W + " " + B);
    }
    static void DFS(int i, int j) {
        visited[i][j] = true;
        char now = map[i][j];
        result++;

        for (int k = 0; k < 4; k++) {
            int Y = i + dy[k];
            int X = j + dx[k];

            if (
                    Y >= 0 && X >= 0 &&
                    Y < M && X < N &&
                    now == map[Y][X] &&
                    !visited[Y][X]
            ) DFS(Y, X);
        }
    }
}
