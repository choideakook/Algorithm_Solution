package org.example.solution.jungol.basic.j1707;

/**
 * 달팽이 사각형
 * 시간 1,000 ms
 * <p>
 * N = 1 ~ 100
 */

import java.util.*;

public class Main_1707 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[] now = {0, 0};
    static boolean[][] visited;
    static int[][] arr;
    static int N, count = 2, tern = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        visited = new boolean[N][N];
        arr = new int[N][N];
        visited[0][0] = true;
        arr[0][0] = 1;

        for (int i = 1; i < N * N; i++)
            draw(now[0], now[1]);
        output();
    }

    static void draw(int Y, int X) {

        int y = Y + dy[tern];
        int x = X + dx[tern];

        if (y >= 0 && x >= 0 &&
                y < N && x < N &&
                !visited[y][x]
        ) {
            visited[y][x] = true;
            arr[y][x] = count;
            now[0] = y;
            now[1] = x;
            count++;
        } else {
            tern++;
            if (tern > 3) tern = 0;
            draw(Y, X);
        }
    }
    static void output() {
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < N; j++)
                sb.append(" " + arr[i][j]);

            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    }
}
