package org.example.solution.baekjoon.dfs_bfs.b1012;

/**
 * 유기농 배추
 * 시간 제한 1초
 *
 * T = 테스트 케이스
 * M = 가로 길이 ( 1 <= M <= 50)
 * N = 세로 길이 ( 1 <= N <= 50)
 * K = 배추 갯수 ( 1 <= K <= 2,500)
 */

import java.util.*;
import java.io.*;

public class Main_1012 {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] con;
    static int M, N, K, result;


    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            counting(st, br);

            System.out.println(result);
            result = 0;
        }
    }
    static void counting(StringTokenizer st, BufferedReader br) throws IOException {
        con = new int[N][M];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            con[Y][X] = 1;
        }
        BFS();
    }
    static void BFS() {
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                if (con[i][j] == 1){
                    queue.add(new int[] {i, j});
                    con[i][j] = 0;
                    result ++;

                    while (!queue.isEmpty()){
                        int[] now = queue.poll();

                        for (int k = 0; k < 4; k++) {
                            int Y = now[0] + dy[k];
                            int X = now[1] + dx[k];

                            if (X >= 0 && Y >= 0 &&
                                    X < M && Y < N &&
                                    con[Y][X] != 0
                            ){
                                queue.add(new int[]{Y, X});
                                con[Y][X] = 0;
                            }
                        }
                    }
                }
            }
        }
    }
}