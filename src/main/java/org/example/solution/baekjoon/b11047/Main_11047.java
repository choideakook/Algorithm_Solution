package org.example.solution.baekjoon.b11047;

/**
 * 동전 0
 * 시간 제한 : 1초
 *
 * N = 동전 수 ( 1 <= N <= 10 )
 * K = 목표 동전 가치의 합 ( 1 <= K <= 100,000,000)
 * A = 동전의 가치 (1 <= A <= 1,000,000 /
 */

import java.util.*;
import java.io.*;

public class Main_11047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long K = Integer.parseInt(st.nextToken());

        long[] A = new long[N];
        int count = 0;

        for (int i = 0; i < N; i++)
            A[i] = Long.parseLong(br.readLine());

        for (int i = N - 1; i >= 0; i--)
            if (K >= A[i]){
                count += K / A[i];
                K = K % A[i];

                if (K == 0) break;
            }

        System.out.println(count);
    }
}
