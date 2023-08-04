package org.example.solution.baekjoon.b2667;

/**
 * 단지번호 붙이기
 * 시간 제한 1초
 * <p>
 * N = 지도 크기 ( 5 <= N <= 25)
 */

import java.util.*;
import java.io.*;

public class Main_2667 {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] check;
    static int[][] map;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        check = new boolean[N][N];
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(line.substring(j, j + 1));
        }
        BFS();
    }
    static void BFS() {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        int[] now = new int[2];
        int count = 0;
        int add = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (map[i][j] > 0 && !check[i][j]){
                    check[i][j] = queue.offer(new int[]{i, j});
                    count++;

                    while (!queue.isEmpty()) {
                        now = queue.poll();

                        for(int k = 0; k < 4; k++){
                            int Y = now[0] + dy[k];
                            int X = now[1] + dx[k];

                            if (
                                    Y >= 0 && X >= 0 &&
                                    Y < N && X < N &&
                                    map[Y][X] > 0 &&
                                    !check[Y][X]
                            ){
                                check[Y][X] = queue.offer(new int[]{Y, X});
                                add++;
                                map[Y][X] += add;
                            }
                        }
                    }
                    list.add(map[now[0]][now[1]]);
                    add = 0;
                }
            }
        }
        Collections.sort(list);
        System.out.println(count);
        for(int i : list) System.out.println(i);
    }
}
