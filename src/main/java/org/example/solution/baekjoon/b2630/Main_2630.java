package org.example.solution.baekjoon.b2630;

/**
 * 색종이 만들기
 * N = X, Y ( 1 ~ 2^k)
 * 0 = white
 * 1 = blue
 */

import java.util.*;
import java.io.*;

public class Main_2630 {
    static int[][] map;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }
        int[] result = zip(new int[]{0, 0}, new int[]{N, N});
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    static int[] zip(int[] S, int[] E) {
        int[] result = new int[2];
        int DY = (S[0] + E[0]) / 2;
        int DX = (S[1] + E[1]) / 2;

        int[] A = search(new int[]{S[0], S[1]}, new int[]{DY, DX});
        int[] B = search(new int[]{S[0], DX}, new int[]{DY, E[1]});
        int[] C = search(new int[]{DY, S[1]}, new int[]{E[0], DX});
        int[] D = search(new int[]{DY, DX}, new int[]{E[0], E[1]});

        result[0] += A[0] + B[0] + C[0] + D[0];
        result[1] += A[1] + B[1] + C[1] + D[1];
        return result;
    }

    static int[] search(int[] S, int[] E) {
        int[] result = new int[2];
        int num = map[S[0]][S[1]];

        for (int i = S[0]; i < E[0]; i++)
            for (int j = S[1]; j < E[1]; j++)
                if (num != map[i][j])
                    return zip(S, E);

        result[num]++;
        return result;
    }
}
