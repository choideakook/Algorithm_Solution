package org.example.solution.baekjoon.dfs_bfs.b11725;

/**
 * 트리의 부모 찾기
 * 시간 제한 1초
 * <p>
 * N (2 <= N <= 100,000)
 */

import java.io.*;
import java.util.*;

public class Main_11725 {
    static List<Integer>[] tree;
    static boolean[] visited;
    static int[] parents;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        tree = new ArrayList[N + 1];
        parents = new int[N + 1];

        for (int i = 1; i < N + 1; i++)
            tree[i] = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            tree[A].add(B);
            tree[B].add(A);
        }

        BFS(1);

        for (int i = 2; i < N + 1; i++)
            System.out.println(parents[i]);
    }

    static void BFS(int root) {
        Queue<Integer> que = new LinkedList<>();
        visited[root] = que.offer(root);

        while (!que.isEmpty()) {
            int node = que.poll();

            for (int i : tree[node])
                if (!visited[i]){
                    visited[i] = que.offer(i);
                    parents[i] = node;
                }
        }
    }
}
