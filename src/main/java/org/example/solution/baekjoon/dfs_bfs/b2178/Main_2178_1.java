package org.example.solution.baekjoon.dfs_bfs.b2178;

/**
 * 미로 찾기 - 복습
 */

import java.io.*;
import java.util.*;

public class Main_2178_1 {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] con;
    static boolean[][] check;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        con = new int[N][M];
        check = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            for (int j = 0; j < M; j++)
                con[i][j] = Integer.parseInt(line.substring(j, j + 1));
        }
        BFS();
        System.out.println(con[N - 1][M - 1]);
    }

    static void BFS(){
        Queue<int[]> queue = new LinkedList<>();
        check[0][0] = queue.offer(new int[]{0, 0});

        while (!queue.isEmpty()){
            int[] now = queue.poll();

            for(int i = 0; i < 4; i++){
                int Y = now[0] + dx[i];
                int X = now[1] + dy[i];

                if (
                        X >= 0 && Y >= 0 &&
                        X < M && Y < N &&
                        !check[Y][X] &&
                        con[Y][X] != 0
                ){
                    check[Y][X] = queue.offer(new int[] {Y, X});
                    con[Y][X] = con[now[0]][now[1]] + 1;
                }
            }
        }
    }
}
