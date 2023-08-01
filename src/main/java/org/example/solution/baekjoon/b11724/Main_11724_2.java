package org.example.solution.baekjoon.b11724;

/**
 * 연결 요소의 개수 구하기
 *
 * 재귀함수를 사용한 문제 풀이
 */

import java.io.*;
import java.util.*;

public class Main_11724_2 {

    static ArrayList<Integer>[] A;
    static boolean[] check;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        A = new ArrayList[N + 1];
        check = new boolean[N + 1];

        for (int i = 0; i < N + 1; i++) A[i] = new ArrayList<Integer>();

        for (int i = 1; i < M + 1; i++){
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());

            A[V].add(U);
            A[U].add(V);
        }

        for(int i = 1; i < N + 1; i++)
            if (!check[i]){
                count++;
                DFS(i);
            }
        System.out.println(count);
    }

    static void DFS(int v) {
        if (check[v]) return;

        check[v] = true;

        for(Integer num : A[v])
            if (!check[num]) DFS(num);
    }
}
