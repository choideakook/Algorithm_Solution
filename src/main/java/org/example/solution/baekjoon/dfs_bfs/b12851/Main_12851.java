package org.example.solution.baekjoon.dfs_bfs.b12851;

/**
 * 숨바꼭질 2
 * 시간 2초
 *
 *  N = start ( 0 ~ 100,000 )
 *  K = goal ( 0 ~ 100,000 )
 */

import java.util.*;

public class Main_12851 {
    static int N, K, result, count;
    static int[] walk =  {1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        Queue<int[]> Q = new LinkedList<>();
        int[] now = {K, 0};
        Q.add(now);

        while (true){
            now = Q.poll();

            for (int i = 0; i < 3; i++) {
                if (i < 2)
                    Q.add(new int[] {now[0] + walk[i], now[1] + 1});
                else
                    if(now[0] % 2 != 0) continue;
                    else Q.add(new int[] {now[0] / 2, now[1] + 1});
            }

            if (now[0] == N) {
                if (result == 0) {
                    result = now[1];
                    count++;
                }
                else if (result == now[1])
                    count++;
                else if (result < now[1])
                    break;
            }
        }
        System.out.println(result + "\n" + count);
    }
}
