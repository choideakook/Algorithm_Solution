package org.example.solution.baekjoon.b2042;

/**
 * 구간 합 구하기
 * 제한 시간 2초
 * 수의 개수 1 <= N <= 1,000,000
 * 변경 횟수 1 <= M <= 10,000
 * 구간 합 횟수 1 <= K <= 10,000
 * a = 1 일 때 b 번째를 c 로 변경
 * a = 2 일 때 b ~ c 까지 합을 구함
 */

import java.util.*;
import java.io.*;

public class Main_2042 {

    static long[] tree;
    static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int square = 1;
        while (square < N) square *= 2;

        tree = new long[square * 2];
        for (int i = square; i < square + N; i++)
            tree[i] = Long.parseLong(br.readLine());

        for (int i = tree.length - 1; i > 1; i--)
            tree[i/2] += tree[i];

        for (int i = 0; i < M + K; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int start = Integer.parseInt(st.nextToken()) + square - 1;
            long c = Long.parseLong(st.nextToken());

            if (a == 1) update(start, tree[start] - c);

            else {
                sum(start, (int) c + square - 1);
                System.out.println(result);
                result = 0;
            }
        }
    }

    private static void update(int index, long num){
        tree[index] -= num;
        if (index > 1) update(index / 2, num);
    }

    private static void sum(int start, int end){
        if(start != end) {
            if (start % 2 == 1) result += tree[start];
            if (end % 2 == 0) result += tree[end];
        }

        if (start < end) sum((start + 1) / 2, (end - 1) / 2);

        else if (start == end) result += tree[start];
    }
}
