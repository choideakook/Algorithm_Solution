package org.example.solution.baekjoon.dfs_bfs.b2583;

/**
 * 영역 구하기
 * 시간 제한 1초
 *
 * M = x 축
 * N = y 축
 * N, M <= 100
 * K = 직사각형 숫자
 */

import java.io.*;
import java.util.*;

public class Main_2583 {

    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static PriorityQueue<Integer> result = new PriorityQueue<>();
    static Stack<int[]> stack = new Stack<>();
    static boolean[][] visited;
    static int N, M, K, sum;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 0.0 이 왼쪽 아래에서 시작하기 때문에 계산의 편의를 위해 x, y 값을 변경해 90도 회전시킴
        N = Integer.parseInt(st.nextToken()); // N = X 축
        M = Integer.parseInt(st.nextToken()); // M = Y 축
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[M][N];
        int count = 0;

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            // 표를 90도 회전했기 때문에 K 좌표도 90도 회전
            int Y1 = Integer.parseInt(st.nextToken());
            int X1 = Integer.parseInt(st.nextToken());
            int Y2 = Integer.parseInt(st.nextToken()) - 1;
            int X2 = Integer.parseInt(st.nextToken()) - 1;

            for (int j = Y1; j <= Y2; j++)
                for (int k = X1; k <= X2; k++)
                    visited[j][k] = true;
        }

        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++){
                if (!visited[i][j]){
                    sum = 0;
                    count++;
                    DFS(i, j);
                    result.add(sum);
                }
            }

        System.out.println(count);
        while (!result.isEmpty())
            System.out.print(result.poll() + " ");
    }

    static void DFS(int i, int j) {
        stack.push(new int[]{i, j});
        visited[i][j] = true;
        sum++;

        while (!stack.isEmpty()){
            int[] now = stack.pop();

            for(int k = 0; k < 4; k++){
                int Y = now[0] + dy[k];
                int X = now[1] + dx[k];

                if (Y >= 0 && X >= 0 &&
                        Y < M && X < N &&
                        !visited[Y][X]
                )
                    DFS(Y, X);
            }
        }
    }
}
