package org.example.solution.baekjoon.b2042;

/**
 * 구간 합 구하기
 * 제한 시간 2초
 * 수의 개수 1 <= N <= 1,000,000
 * 변경 횟수 1 <= M <= 10,000
 * 구간 합 횟수 1 <= K <= 10,000
 * a = 1 일 때 b 번째를 c 로 변경
 * a = 2 일 때 b ~ c 까지 합을 구함
 *
 * 스케너로 수정
 */

import java.util.*;

public class Main_2042_1 {

    static int[] tree;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int square = 1;
        while (square < N) square *= 2;

        tree = new int[square * 2];
        for (int i = square; i < square + N; i++)
            tree[i] = sc.nextInt();

        for (int i = tree.length - 1; i > 1; i--)
            tree[i/2] += tree[i];

        for (int i = 0; i < M + K; i++){
            int a = sc.nextInt();
            int start = sc.nextInt() + square - 1;
            int c = sc.nextInt();

            if (a == 1) update(start, tree[start] - c);

            else {
                cal(start, c + square - 1);
                System.out.println(result);
                result = 0;
            }
        }
    }

    private static void update(int index, int num){
        tree[index] -= num;
        if (index > 1) update(index / 2, num);
    }

    private static void cal(int start, int end){
        if(start != end) {
            if (start % 2 == 1) result += tree[start];
            if (end % 2 == 0) result += tree[end];
        }

        if (start < end) cal((start + 1) / 2, (end - 1) / 2);

        else if (start == end) result += tree[start];
    }
}
