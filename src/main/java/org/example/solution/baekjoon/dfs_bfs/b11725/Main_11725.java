package org.example.solution.baekjoon.dfs_bfs.b11725;

/**
 * 트리의 부모 찾기
 * 시간 제한 1초
 *
 * N (2 <= N <= 100,000)
 */

import java.io.*;
import java.util.*;

public class Main_11725 {
    static List<Integer>[] tree;
    static boolean[] visited;
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        tree = new ArrayList[N + 1];

        for (int i = 1; i < N + 1; i++)
            tree[i] = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            tree[A].add(B);
            tree[B].add(A);
        }

        for(int i = 2; i < N + 1; i++) {
            visited = new boolean[N + 1];
            BFS(1, i);
        }
    }
    static void BFS(int root, int target){
        Queue<Integer> que = new LinkedList<>();
        visited[root] = que.offer(root);

        while (!que.isEmpty()) {
            int node = que.poll();

            for(int i : tree[node])
                if (i == target){
                    System.out.println(node);
                    return;
                }

                else if (!visited[i])
                    visited[i] = que.offer(i);
        }
    }
}
