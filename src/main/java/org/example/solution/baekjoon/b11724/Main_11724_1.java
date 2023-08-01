package org.example.solution.baekjoon.b11724;

/**
 * 연결 요소의 개수 구하기 - 정답
 *
 */

import java.util.*;
import java.io.*;

public class Main_11724_1 {

    static boolean[] visited;
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        visited = new boolean[N + 1];
        A = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++)
            A[i] = new ArrayList<Integer>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            A[S].add(E);
            A[E].add(S);
        }

        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    static void DFS(int v) {
        if (visited[v]) return;

        visited[v] = true;

        for(int i : A[v])
            if (!visited[i]) DFS(i);
    }
}
