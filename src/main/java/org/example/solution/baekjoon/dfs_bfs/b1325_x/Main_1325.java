package org.example.solution.baekjoon.dfs_bfs.b1325_x;

/**
 * 효율적인 해킹
 * 시간 제한 5초
 * <p>
 * N = 컴퓨터 수 (1 <= N <= 10,000)
 * M = 신뢰 관계 (1 <= M 100,000)
 * <p>
 * 결과 : 시간초과로 실패
 */

import java.io.*;
import java.util.*;

public class Main_1325 {

    static TreeSet<Integer> set = new TreeSet<>();
    static Stack<Integer> stack = new Stack<>();
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int[] trust;
    static int N, M, max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()) + 1;
        M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N];

        for (int i = 1; i < N; i++)
            list[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            list[A].add(B);
        }

        for (int i = 1; i < N; i++) {
            if (trust[i] == 0) {
                visited = new boolean[N];
                trust = new int[N];
                trust[i]++;
                BFS(i);
            }


        }
        for (int i : set)
            System.out.println(i + " ");
    }

    static void BFS(int i) {
        stack.push(i);
        visited[i] = true;


        while (!stack.isEmpty()){
            stack.pop();

            for (int node : list[i])
                if (!visited[node]) {
                    BFS(node);

                }
        }
    }
}
