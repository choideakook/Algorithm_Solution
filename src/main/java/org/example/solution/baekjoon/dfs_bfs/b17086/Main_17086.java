package org.example.solution.baekjoon.dfs_bfs.b17086;

/**
 * 아기 상어 2
 * 시간 2초
 *
 * N = Y ( 2 ~ 50 )
 * M = X ( 2 ~ 50 )
 */

import java.util.*;
import java.io.*;

public class Main_17086 {
    static int[] dy = {1, 0, -1, 0, 1, 1, -1, -1};
    static int[] dx = {0, 1, 0, -1, 1, -1, 1, -1};
    static Queue<int[]> Q = new LinkedList<>();
    static int[][] map;
    static int N, M, result;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num == 1) {
                    map[i][j] = 1;
                    Q.add(new int[]{i, j});
                }
            }
        }
        BFS();

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                result = Math.max(map[i][j], result);

        System.out.println(result - 1);
    }
    static void BFS(){

        while (!Q.isEmpty()){
            int[] now = Q.poll();

            for (int i = 0; i < 8; i++) {
                int Y = now[0] + dy[i];
                int X = now[1] + dx[i];

                if (
                        Y >= 0 && X >= 0 &&
                        Y < N && X < M &&
                        map[Y][X] == 0
                ){
                    map[Y][X] = map[now[0]][now[1]] + 1;
                    Q.add(new int[] {Y, X});
                }
            }
        }
    }
}
