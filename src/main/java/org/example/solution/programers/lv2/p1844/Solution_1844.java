package org.example.solution.programers.lv2.p1844;

/**
 * 게임 맵 최단거리
 * maps ( 1 ~ 100 )
 * 0 = wall / 1 = pass
 */

import java.util.*;

public class Solution_1844 {
    public int solution(int[][] maps) {
        Queue<int[]> Q = new LinkedList<>();
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        int N = maps.length;
        int M = maps[0].length;
        Q.add(new int[]{0,0});

        while (!Q.isEmpty()) {
            int[] now = Q.poll();

            for (int i = 0; i < 4; i++) {
                int Y = now[0] + dy[i];
                int X = now[1] + dx[i];

                if (
                        Y >= 0 && X >= 0 &&
                        Y < N && X < M &&
                        maps[Y][X] == 1
                ){
                    Q.add(new int[]{Y, X});
                    maps[Y][X] += maps[now[0]][now[1]];
                }
            }
        }
        return maps[N - 1][M - 1] == 1 ? -1 : maps[N - 1][M - 1];
    }
}
