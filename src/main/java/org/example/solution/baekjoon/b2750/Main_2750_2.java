package org.example.solution.baekjoon.b2750;

/**
 * 수 정렬하기 - 버블정렬로 풀어보기
 */

import java.util.*;

public class Main_2750_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();

        for(int i = 0; i < N - 1; i++){

            for (int j = 0; j < N - 1 - i; j++)
                if (A[j] > A[j + 1]){
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }

        }
        for(int i : A)
            System.out.println(i);
    }
}
