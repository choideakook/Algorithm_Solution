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

public class Main_11047_Doit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int A[] = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        for (int i = N - 1; i >= 0; i--)
            if (A[i] <= K){
                count += K / A[i];
                K = K % A[i];

                if (K == 0) break;
            }
        System.out.println(count);
    }
}
