package org.example.solution.baekjoon.dfs_bfs.b11724;

/**
 * 연결 요소의 개수
 * <p>
 * 시간 제한 : 3초
 * N = 정점 수
 * M = 간선 수
 * 1 <= N <= 1,000 < = M <= N(N - 1) / 2)
 * 정점은 1 보다 크고 N 보다 적다.
 * 정점의 값은 고유하다.
 */

import java.io.*;
import java.util.*;

public class Main_11724 {

    static boolean[] checker;
    static int root;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        checker = new boolean[N + 1];
        checker[0] = true;
        int count = 0;

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            map.put(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }

        while (findFalse()){
            stack.push(root);
            checker[root] = true;
            count++;

            while (!stack.isEmpty()){
                Integer v = map.get(stack.pop());

                if (v == null) break;

                else if (!checker[v]){
                    checker[v] = true;
                    stack.push(v);
                }
            }
        }
        System.out.println(count);
    }

    static boolean findFalse() {
        for (int i = 1; i < checker.length; i++)
            if (!checker[i]){
                root = i;
                return true;
            }

        return false;
    }
}
