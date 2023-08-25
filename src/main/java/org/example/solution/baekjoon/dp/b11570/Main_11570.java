package org.example.solution.baekjoon.dp.b11570;

/**
 * 환상의 듀엣
 * 시간 2초
 *
 * N = length ( 1 ~ 2,000 )
 * index ( 1 ~ 1,000,000 )
 */

import java.util.*;
import java.io.*;

public class Main_11570 {
    static int[] map, pre;
    static boolean startB;
    static int A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        map[0] = Integer.parseInt(st.nextToken());
        pre = new int[] {map[0], 0};

        for (int i = 1; i < N; i++) {
            map[i] = Integer.parseInt(st.nextToken());
            int gap = Math.abs(map[i - 1] - map[i]);
            if (pre[1] < gap) pre[1] = map[i];
        }
        for (int i = 1; i < N; i++) {
            if (!startB)
                startB(i);
            else
                compare(Math.abs(map[i] - pre[0]),
                        Math.abs(map[i] - pre[1]), map[i]);
        }
        if (A + B == 0) System.out.println(1);
        else System.out.println(A + B);
    }
    static void startB(int i){
        if (map[i] == pre[1])
            startB = true;
        else {
            A += Math.abs(pre[0] - map[i]);
            pre[0] = map[i];
        }
    }
    static void compare(int a, int b, int index) {
        if (a >= b) {
            B += b;
            pre[1] = index;
        }
        else {
            A += a;
            pre[0] = index;
        }
    }
}
