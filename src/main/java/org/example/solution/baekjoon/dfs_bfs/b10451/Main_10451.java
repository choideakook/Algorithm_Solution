package org.example.solution.baekjoon.dfs_bfs.b10451;

/**
 * 순열 사이클
 * 시간 제한 1초
 *
 * T = test case
 * N = 순열의 크기 (2 <= N <= 1,000)
 */

import java.util.*;
import java.io.*;

public class Main_10451 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
            solution(br);
    }

    static void solution(BufferedReader br) throws IOException{
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] list = new ArrayList[N + 1];
        boolean[] check = new boolean[N + 1];
        int result = 0;

        for (int i = 1; i <= N; i++) list[i] = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++){
            int num = Integer.parseInt(st.nextToken());

            list[i].add(num);
            list[num].add(i);
        }

        for (int i = 1; i <= N; i++) {
            if (!check[i]) {
                Queue<Integer> queue = new LinkedList<>();
                check[i] = queue.offer(i);
                result++;

                while (!queue.isEmpty()) {
                    int num = queue.poll();

                    for (Integer index : list[num])
                        if (!check[index])
                            check[index] = queue.offer(index);
                }
            }
        }
        System.out.println(result);
    }
}
