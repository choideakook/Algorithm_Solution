package org.example.solution.baekjoon.greedy.b1715;

/**
 * 카드 정렬하기
 * 시간 2초
 *
 * N = deck length ( 1 ~ 100,000 )
 * deck ( 1 ~ 1,000 )
 */

import java.util.*;

public class Main_1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long result = 0;

        PriorityQueue<Long> Q = new PriorityQueue<>();

        for (int i = 0; i < N; i++)
            Q.add(sc.nextLong());

        while (!Q.isEmpty()){
            long sum = Q.poll() + Q.poll();
            result += sum;

            if (Q.size() != 0) Q.add(sum);

            else if (Q.size() == 1) result += Q.poll();
        }
        System.out.println(result);
    }
}
