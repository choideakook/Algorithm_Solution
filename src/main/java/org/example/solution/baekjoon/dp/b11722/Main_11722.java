package org.example.solution.baekjoon.dp.b11722;

/**
 * 가장 긴 감소하는 부분 수열
 * 시간 1초
 *
 * A = 수열 ( 1 ~ 1,000 )
 * a = A's index ( 1 ~ 1,000 )
 */

import java.util.*;
import java.io.*;

public class Main_11722 {
    static int[] A = new int[1001];
    static int[] D = new int[1001];
    static int result;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            A[i] = Integer.parseInt(st.nextToken());

        D[0] = 1;

        for (int i = 1; i < N; i++) {
            if (A[i - 1] > A[i]) D[i] = D[i - 1] + 1;
            else if (A[i - 1] == A[i]) D[i] = D[i - 1];
            else D[i] = search(i);

            if (D[i] > result) result = D[i];
        }
        System.out.println(result);
    }
    static int search(int i){
        for (int j = i - 1; j >= 0; j--) {
            if (A[i] < A[j]) return D[j] + 1;
            else if (A[i] == A[j]) return D[j];
        }
        return 1;
    }
}
