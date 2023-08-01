package org.example.solution.baekjoon.b1012;

/**
 * 유기농 배추
 * 시간 제한 1초
 *
 * T = 테스트 케이스
 * M = 가로 길이 ( 1 <= M <= 50)
 * N = 세로 길이 ( 1 <= N <= 50)
 * K = 배추 갯수 ( 1 <= K <= 2,500)
 */

import java.util.*;
import java.io.*;

public class Main_1012 {

    static ArrayList<Integer>[] con;
    static boolean[] check;
    static int count;

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) reset(br);
    }

    static void reset(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        con = new ArrayList[K];
        check = new boolean[K];
        count = 0;

        for(int i = 0; i < )

    }

}
