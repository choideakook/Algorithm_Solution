package org.example.solution.baekjoon.dfs_bfs.b2644;

/**
 * 촌수 계산
 * 시간 제한 1초
 *
 * N = 사람 (1 <= N <= 100)
 * M = 관계
 * X = 부모 (부모는 한명만 존재)
 * Y = 자식 (자식은 여려명 가능)
 *
 * 두 사람의 촌수를 출력 (관계가 없을 땐 -1 출력)
 */

import java.io.*;
import java.util.*;

public class Main_2644 {

    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int[] length;
    static int N, M, A, B;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()) + 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(br.readLine());

        visited = new boolean[N];
        list = new ArrayList[N];
        length = new int[N];

        for (int i = 1; i < N; i++)
            list[i] = new ArrayList<>();

        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            list[X].add(Y);
            list[Y].add(X);
        }
        
        BFS(A);

        if (length[B] == 0)
            System.out.println(-1);
        else
            System.out.println(length[B]);
    }
    
    static void BFS(int i){
        Queue<Integer> que = new LinkedList<>();
        visited[i] = que.offer(i);

        while (!que.isEmpty()){
            int node = que.poll();

            for(int index : list[node])
                if (!visited[index]){
                    visited[index] = que.offer(index);
                    if (length[node] == 0) length[index]++;
                    else length[index] += length[node] + 1;
                }
        }
    }
}
