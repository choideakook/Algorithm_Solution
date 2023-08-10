package org.example.solution.baekjoon.basic.b2798_brute_force;

/**
 * 블랙잭
 * 시간 제한 : 1초
 *
 * N = card ( 3 ~ 100 )
 * M = max ( 10 ~ 300,000 )
 */

import java.util.*;
import java.io.*;

public class Main_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] card = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            card[i] = Integer.parseInt(st.nextToken());

        System.out.println(bruteForce(card, N, M));
    }

    static int bruteForce(int[] card, int N, int M) {
        int max = 0;
        int gap = M - max;

        for (int i = 0; i < N - 2; i++)
            for (int j = i + 1; j < N - 1; j++)
                for (int k = j + 1; k < N; k++) {
                    int sum = card[i] + card[j] + card[k];

                    if (M == sum) return sum;
                    else if (M < sum) continue;

                    if (gap > M - sum) {
                        max = sum;
                        gap = M - sum;
                    }
                }
        return max;
    }
}
