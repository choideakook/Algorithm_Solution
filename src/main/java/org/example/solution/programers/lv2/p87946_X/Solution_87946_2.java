package org.example.solution.programers.lv2.p87946_X;

/**
 * 피로도
 * k = user 피로도 ( 1 ~ 5,000 )
 * dungeons[1 ~ 8][2] {최소 , 소모} ( 최소 >= 소모 / 1 ~ 1,000 )
 */

public class Solution_87946_2 {
    boolean[] visited;
    int[][] arr;
    int answer;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        arr = dungeons;
        DFS(k, 0);

        return answer;
    }
    void DFS(int k, int count) {
        answer = Math.max(answer, count);
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i] && arr[i][0] <= k) {
                visited[i] = true;
                k -= arr[i][1];

                DFS(k, count + 1);

                visited[i] = false;
                k += arr[i][1];
            }
        }
    }
}