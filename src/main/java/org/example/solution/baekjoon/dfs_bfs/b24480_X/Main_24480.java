package org.example.solution.baekjoon.dfs_bfs.b24480_X;

/**
 * 알고리즘 수업 - 깊이 우선 탐색 2
 * 시간 제한 1초
 *
 * N = node ( 1 ~ 100,000 )
 * M = connect ( 1 ~ 200,000 )
 * R = root ( 1 ~ N )
 */

import java.io.*;
import java.util.*;

public class Main_24480 {
    static int N, M, R;
    static boolean[] visited;
    static ArrayList<Integer>[] tree;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()) + 1;
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        tree = new ArrayList[N];

        for (int i = 1; i < N; i++)
            tree[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int U = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            tree[U].add(V);
            tree[V].add(U);
        }

        DFS(R);
        System.out.println(0);
    }
    static void DFS(int node) {
        Collections.sort(tree[node], Collections.reverseOrder());
        System.out.println(node);
        visited[node] = true;

        for (int i : tree[node])
            if (!visited[i])
                DFS(i);
    }
}
