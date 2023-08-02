package org.example.solution.baekjoon.b2178;

/**
 * 미로 탐색
 * 시간 제한 : 1초
 *
 * N = 세로
 * M = 가로
 * 2 <= N, M <= 100
 */

import java.util.*;
import java.io.*;

public class Main_2178 {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0,-1, 0};
    static boolean[][] visited;
    static int[][] A;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();

            for (int j = 0; j < M; j++)
                A[i][j] = Integer.parseInt(line.substring(j, j + 1));
        }


        BFS(0, 0);
        System.out.println(A[N - 1][M - 1]);
    }

    static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            visited[i][j] = true;

            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                // x, y 가 0 보다 크고, 배열의 범위를 표 않음
                if (x >= 0 && y >= 0 && x < N && y < M)
                    // x, y 의 값이 0 이 아니고, 방문하지 않았어야 함
                    if (A[x][y] != 0 && !visited[x][y]){
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1;
                        queue.add(new int[] {x,y});
                    }
            }
        }
    }
}
