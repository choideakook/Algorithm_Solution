package org.example.solution.baekjoon.dfs_bfs.b2468;

/**
 * 안전 영역
 * 시간 제한 1초
 * <p>
 * N = 가로, 세로 (2 <= N <= 100)
 */

import java.io.*;
import java.util.*;

public class Main_2468 {

    static Stack<int[]> stack = new Stack<>();
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] check;
    static int[][] map;
    static int max;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        max = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                if (max < num) max = num;
            }
        }

        int result = 0;

        while (max >= 0) {
            check = new boolean[N][N];
            int count = 0;

            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    if (map[i][j] >= max && !check[i][j]) {
                        DFS(i, j);
                        count++;
                    }

            if (result < count) result = count;
            max--;
        }
        System.out.println(result);
    }

    static void DFS(int i, int j) {
        stack.push(new int[]{i, j});
        check[i][j] = true;

        while (!stack.isEmpty()) {
            int[] now = stack.pop();

            for (int k = 0; k < 4; k++) {
                int Y = now[0] + dy[k];
                int X = now[1] + dx[k];

                if (
                        Y < N && X < N &&
                                Y >= 0 && X >= 0 &&
                                map[Y][X] >= max &&
                                !check[Y][X]
                )
                    DFS(Y, X);
            }
        }
    }
}
