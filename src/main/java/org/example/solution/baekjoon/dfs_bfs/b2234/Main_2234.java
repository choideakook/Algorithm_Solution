package org.example.solution.baekjoon.dfs_bfs.b2234;

/**
 * 성곽
 * N = Y ( 1 - 50 )
 * M = X ( 1 - 50 )
 * 좌 = 1
 * 상 = 2
 * 우 = 4
 * 하 = 8
 */

import java.io.*;
import java.util.*;
public class Main_2234 {
    static int N, M, wall = 15;
    static int[][] map;
    static boolean[][] visit;
    static int[] way = {8, 4, 2, 1};
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[] answers = new int[3];
    static List<Integer> room = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        visit = new boolean[N][M];
        map = new int[N][M];

        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 0; x < M; x++)
                map[y][x] = Integer.parseInt(st.nextToken());
        }

        for (int y = 0; y < N; y++)
            for (int x = 0; x < M; x++)
                if (!visit[y][x]) {
                    int count = BFS(y, x);
                    room.add(count);
                    answers[0]++;
                    answers[1] = Math.max(answers[1], count);
                }

        for (int y = 0; y < N; y++)
            for (int x = 0; x < M; x++)
                if (visit[y][x])
                    answers[2] = Math.max(answers[2], BFS2(y, x));

        for (int answer : answers)
            System.out.println(answer);
    }

    private static int BFS2(int y, int x) {
        Queue<int[]> Q = new LinkedList<>();
        Q.add(new int[]{y, x});
        visit[y][x] = false;
        int count = room.get(map[y][x]);
        int max = count;

        while (!Q.isEmpty()) {
            int[] now = Q.poll();
            for (int i = 0; i < 4; i++) {
                int Y = now[0] + dy[i];
                int X = now[1] + dx[i];

                if (
                        Y >= 0 && X >= 0 &&
                        Y < N && X < M &&
                        visit[Y][X]
                ) {
                    if (map[now[0]][now[1]] == map[Y][X]) {
                        Q.add(new int[]{Y, X});
                        visit[Y][X] = false;
                    } else
                        max = Math.max(max, count + room.get(map[Y][X]));
                }

            }
        }
        return max;
    }

    private static int BFS(int y, int x) {
        Queue<int[]> Q = new LinkedList<>();
        visit[y][x] = Q.offer(new int[]{y, x});
        int count = 1;

        while (!Q.isEmpty()) {
            int[] now = Q.poll();
            int room = wall - map[now[0]][now[1]];
            map[now[0]][now[1]] = answers[0];

            for (int i = 0; i < 4; i++)
                if (way[i] <= room) {
                    room -= way[i];
                    int Y = now[0] + dy[i];
                    int X = now[1] + dx[i];

                    if (!visit[Y][X]) {
                        count++;
                        visit[Y][X] = Q.offer(new int[]{Y, X});
                    }
                }
        }
        return count;
    }
}
