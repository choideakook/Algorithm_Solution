package org.example.solution.baekjoon.dp.b11570_X;

/**
 * 환상의 듀엣
 * 시간 2초
 * <p>
 * N = length ( 1 ~ 2,000 )
 * index ( 1 ~ 1,000,000 )
 */

import java.util.*;
import java.io.*;

public class Main_11570 {
    static int[][] check = new int[2][2];
    static int[] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        map[0] = Integer.parseInt(st.nextToken());
        check[0][1] = map[0];
        int indexB = 0;

        for (int i = 1; i < N; i++) {
            map[i] = Integer.parseInt(st.nextToken());
            int gap = Math.abs(map[i - 1] - map[i]);
            if (check[1][1] < gap){
                check[1][1] = gap;
                indexB = i;
            }
        }
        check[1][1] = map[indexB];

        for (int i = 1; i < indexB; i++) {
            check[0][0] += Math.abs(map[i] - check[0][1]);
            check[0][1] = map[i];
        }
        for (int i = indexB + 1; i < N; i++) {
            int A = Math.abs(map[i] - check[0][1]);
            int B = Math.abs(map[i] - check[1][1]);

            if (A <= B){
                check[0][0] += A;
                check[0][1] = map[i];
            }

        }
    }
}
