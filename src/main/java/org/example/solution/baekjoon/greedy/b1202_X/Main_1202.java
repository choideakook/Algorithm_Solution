package org.example.solution.baekjoon.greedy.b1202_X;

/**
 * 보석 도둑
 * 시간 1초
 *
 * N = total length ( 1 ~ 300,000 )
 * M = weight ( 0 ~ 1,000,000 )
 * V = price ( 0 ~ 1,000,000 )
 *
 * K = bag ( 1 ~ 300,000 )
 * C = capa ( 1 ~ 100,000,000 )
 */

import java.util.*;
import java.io.*;

public class Main_1202 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long result = 0;

        PriorityQueue<Long> bags = new PriorityQueue<>();
        PriorityQueue<long[]> gem = new PriorityQueue<>(((o1, o2) -> {
            if (o1[0] == o2[0])
                return (int) (o2[1] - o1[1]);
            return (int) (o1[0] - o2[0]);
        }));

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            long M = Long.parseLong(st.nextToken());
            long V = Long.parseLong(st.nextToken());

            gem.add(new long[] {M, V});
        }
        for (int i = 0; i < K; i++)
            bags.add(Long.parseLong(br.readLine()));

        while (!bags.isEmpty() && !gem.isEmpty()){
            Long bag = bags.poll();

            if (bag >= gem.peek()[0])
                result += gem.poll()[1];
        }
        System.out.println(result);
    }
}
