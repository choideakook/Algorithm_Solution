package org.example.solution.baekjoon.b1260;

/**
 * DFS 와 BFS
 * 시간 제한 2초
 *
 * N = 노드 수 / 1 <= N <= 1,000
 * M = 간선 수 / 1 <= M <= 10,000
 * V = 정점
 *
 * 출력 1 : DFS
 * 출력 2 : BFS
 */

import java.util.*;
import java.io.*;

public class Main_1260 {

    static StringBuilder sb = new StringBuilder();
    static TreeSet<Integer>[] set;
    static Stack<Integer> stack;
    static boolean[] check;
    static int N, M, V;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        set = new TreeSet[N + 1];

        for (int i = 0; i < N + 1; i++)
            set[i] = new TreeSet<>();

        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());

            set[V].add(U);
            set[U].add(V);
        }
        DFS();
        BFS();
    }
    static void DFS() {
        check = new boolean[N + 1];
        stack = new Stack<>();

        stack.push(V);
        check[V] = true;
        sb.append(V + " ");

        while (!stack.isEmpty())  DFS(stack.pop());

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
        sb.setLength(0);
    }
    static void DFS(int node){

        for (int index : set[node]){
            if (!check[index]){
                check[index] = true;
                stack.push(index);
                sb.append(index + " ");
                DFS(index);
            }
        }
    }
    static void BFS() {
        check = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();

        check[V] = queue.offer(V);
        sb.append(V + " ");

        while (!queue.isEmpty()){
            int node = queue.poll();

            for(int index : set[node]){
                if (!check[index]){
                    check[index] = queue.offer(index);
                    sb.append(index + " ");
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
