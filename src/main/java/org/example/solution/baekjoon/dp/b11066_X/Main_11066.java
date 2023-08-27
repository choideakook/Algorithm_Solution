package org.example.solution.baekjoon.dp.b11066_X;

/**
 * 파일 합치기
 * 시간 2초
 *
 * K = chapter ( 3 ~ 500 )
 * index = 1 ~ 10,000
 */

import java.util.*;
import java.io.*;

public class Main_11066 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<Integer> K;
    static int result, pre;
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
            solution();
    }
    static void solution() throws IOException {
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        K = new ArrayList<>();

        for (int i = 0; i < N; i++)
            K.add(Integer.parseInt(st.nextToken()));
        pre = 0;
        calculator(1);
        System.out.println(result);
    }
    static void calculator(int i){
        if (K.get(i - 1) <= K.get(i + 1) && i - 1 >= 0 && i + 1 < K.size())
            compare(i, -1);
        else if (K.get(i - 1) > K.get(i + 1) && i - 1 >= 0 && i + 1 < K.size())
            compare(i, 1);
    }
    static void compare(int i, int term){
        if (pre == i + term){
            K.set(pre, K.get(pre) + K.get(i));
            result += K.get(pre);
            K.remove(i);
            calculator(pre);
        }else {
            pre = i;
            calculator(i + term);
        }
    }
}
