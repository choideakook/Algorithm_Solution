package org.example.solution.baekjoon.dp.b11066_X;

import java.util.*;
import java.io.*;

public class Main_11066_2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
            solution();
    }
    static void solution() throws IOException{
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] dp = new int[K + 1][K + 1];
        int[] novel = new int[K + 1];
        int[] sum = new int[K + 1];

        for (int i = 1; i <= K; i++) {
            novel[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i - 1] + novel[i];
        }

        for (int i = 1; i <= K; i++) {
            for (int from = 1; from + i <= K; from++) {
                int to = from + i;
                dp[from][to] = Integer.MAX_VALUE;

                for (int divide = from; divide < to; divide++) {
                    dp[from][to] = Math.min(
                            dp[from][to],
                            dp[from][divide] + dp[divide + 1][to] + sum[to] - sum[from - 1]
                    );
                }
            }
        }
        System.out.println(dp[1][K]);
    }
}
