package org.example.solution.baekjoon.dfs_bfs.b2606;

/**
 * 바이러스
 * 시간 제한 : 1초
 *
 * N = 컴퓨터의 수 1 <= N <= 100
 * M = 네트워크의 수
 */

import java.util.*;
import java.io.*;

public class Main_2606 {

    static ArrayList<Integer>[] con;
    static boolean[] check;
    static int count;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        count = 0;

        con = new ArrayList[N + 1];
        check = new boolean[N + 1];

        for(int i = 0; i < N + 1; i++) con[i] = new ArrayList<Integer>();

        for(int i = 1; i < M + 1; i++){
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());

            con[V].add(U);
            con[U].add(V);
        }

        DFS(1);
        System.out.println(count - 1);
    }
    static void DFS(int v){
        if (check[v]) return;

        check[v] = true;
        count++;

        for(int i : con[v])
            if (!check[i]) DFS(i);
    }
}
