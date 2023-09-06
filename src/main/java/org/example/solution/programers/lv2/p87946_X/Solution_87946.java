package org.example.solution.programers.lv2.p87946_X;

/**
 * 피로도
 * k = user 피로도 ( 1 ~ 5,000 )
 * dungeons[1 ~ 8][2] {최소 , 소모} ( 최소 >= 소모 / 1 ~ 1,000 )
 */

public class Solution_87946 {
    static boolean[] visited;
    static int answer = -1;

    public int solution(int k, int[][] dungeons) {

        visited = new boolean[dungeons.length];

        DFS(k, dungeons, 0);
        return answer;
    }

    public void DFS(int k, int[][] dungeons, int cnt){

        answer = Math.max(answer, cnt);
        for(int i=0; i<dungeons.length; i++){
            if(visited[i] == false && dungeons[i][0] <= k){
                // 최소 필요 피로도가 현재 피로도보다 작을 때

                visited[i] = true;
                k -= dungeons[i][1];

                DFS(k, dungeons, cnt+1);

                visited[i] = false;
                k += dungeons[i][1];

            }
        }

    }
}