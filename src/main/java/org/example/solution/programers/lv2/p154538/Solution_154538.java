package org.example.solution.programers.lv2.p154538;

/**
 * 숫자 변환기
 * x = start ( 1 ~ y )
 * y = target ( x ~ 1,000,000 )
 * n = sum ( 1 ~ (y - 1) )
 *
 * 방법 : + n / * 2 / * 3
 */

import java.util.*;

public class Solution_154538 {
    int X, Y, N, answer = -1;
    public int solution(int x, int y, int n) {
        X = x; Y = y; N = n;
        BFS(y);
        return answer;
    }
    void BFS(int start) {
        boolean[] visited = new boolean[1000001];
        Queue<int[]> Q = new LinkedList<>();
        visited[start] = Q.offer(new int[]{start, 0});

        while (!Q.isEmpty()) {
            int[] now = Q.poll();
            if (now[0] == X) {
                answer = now[1];
                break;
            }

            if (now[0] % 3 == 0 && !visited[now[0] / 3])
                visited[now[0] / 3] = Q.offer(new int[]{now[0] / 3, now[1] + 1});
            if (now[0] % 2 == 0 && !visited[now[0] / 2])
                visited[now[0] / 2] = Q.offer(new int[]{now[0] / 2, now[1] + 1});
            if (now[0] - N >= 0 && !visited[now[0] - N])
                visited[now[0] - N] = Q.offer(new int[]{now[0] - N, now[1] + 1});
        }
    }
}