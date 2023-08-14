package org.example.solution.baekjoon.greedy.b11000;

/**
 * 강의실 배정
 * 시간 1초
 * <p>
 * N = class ( 1 ~ 200,000 )
 */

import java.util.*;
import java.io.*;

public class Main_11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1 ,o2) ->{
            if (o1[0] == o2[0])
                return o1[1] - o2[1];
            return o1[0] - o2[0];
        });

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            queue.add(new int[] {A, B});
        }

        PriorityQueue<Integer> Q = new PriorityQueue<>();

        while (!queue.isEmpty()){
            int[] poll = queue.poll();

            if (!Q.isEmpty() && Q.peek() <= poll[0])
                Q.poll();

            Q.add(poll[1]);
        }
        System.out.println(Q.size());
    }
}
