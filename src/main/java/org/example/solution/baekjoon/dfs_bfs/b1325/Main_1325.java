package org.example.solution.baekjoon.dfs_bfs.b1325;

/**
 * 효율적인 해킹
 * 시간 제한 5초
 *
 * N = 컴퓨터 수 (1 <= N <= 10,000)
 * M = 신뢰 관계 (1 <= M 100,000)
 */

import java.io.*;
import java.util.*;

public class Main_1325{

    static TreeSet<Integer> set = new TreeSet<>();
    static Stack<Integer> stack = new Stack<>();
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int N, M, count, max = 0;

    public static void main(String[] args) throws IOException{
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

            list[B].add(A);
        }

        for (int i = 1; i < N; i++) {
            visited = new boolean[N];
            count = 0;
            DFS(i);

            if (max < count) {
                set.clear();
                set.add(i);
                max = count;
            }
            else if (max == count)
                set.add(i);
        }
        for(int i : set)
            System.out.println(i + " ");
    }

    static void DFS(int i){
        stack.push(i);
        visited[i] = true;
        count++;

        while (!stack.isEmpty()){
            stack.pop();

            for(int node : list[i])
                if (!visited[node])
                    DFS(node);
        }
    }
}
