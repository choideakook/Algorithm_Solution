package org.example.solution.baekjoon.dfs_bfs.b13565;

/**
 * 침투
 * 시간 제한 1초
 * <p>
 * M = y축 ( 2 <= M <= 1,000)
 * N = x축 ( 2 <= N <= 1,000)
 * 0 = 흰색
 * 1 = 검은색
 */

import java.util.*;
import java.io.*;

public class Main_13565 {

    static Stack<int[]> stack = new Stack<>();
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N, M;
    static boolean yes;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        visited = new boolean[M][N];
        map = new int[M][N];

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(line.substring(j, j + 1));
        }

        for (int i = 0; i < N; i++)
            if (map[M - 1][i] == 0 && !visited[M - 1][i])
                DFS(M - 1, i);

        if (yes)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    static void DFS(int y, int x) {
        stack.push(new int[]{y, x});
        visited[y][x] = true;

        if (y == 0) {
            yes = true;
            return;
        }

        while (!stack.isEmpty()){
            int[] now = stack.pop();

            for (int i = 0; i < 4; i++) {
                int Y = now[0] + dy[i];
                int X = now[1] + dx[i];

                if (
                        X >= 0 && Y >= 0 &&
                        X < N && Y < M &&
                        !visited[Y][X] &&
                        map[Y][X] == 0
                )
                    DFS(Y, X);

                if (yes) break;
            }
            if (yes) break;
        }
    }
}
