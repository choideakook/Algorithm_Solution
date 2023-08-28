package org.example.solution.baekjoon.dp.b11049;

/**
 * 행렬 곱셈 순서
 * 시간 1초
 *
 * N = length ( 1 ~ 500 )
 * index = 1 ~ 500
 */

import java.util.*;
import java.io.*;

public class Main_11049 {
    static ArrayList<Arr> list = new ArrayList<>();
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list.add(new Arr(r, c));
        }
        DP(1);
    }
    static void DP(int i) {
        int left = list.get(i).mul(list.get(i - 1).R);
        int right = list.get(i).mul(list.get(i + 1).C);

        if (left > right){
            result += right;
            list.get(i).C = list.get(i + 1).C;
            list.remove(i + 1);
        }
    }
    static class Arr {
        int R;
        int C;
        public int mul(int i) {
            return R * C * i;
        }
        public Arr(int r, int c) {
            R = r;
            C = c;
        }
    }
}
