package org.example.solution.baekjoon.b11286;

/**
 * 절댓값 힙
 *
 * 제한 시간 : 1sc
 * 1 <= N <= 100,000
 * x : 연산에 대한 정보를 나타내는 정수
 * -2^31 < x < 2^31
 * x != 0 -> 배열에 x 추가
 * x == 0 -> 배열에 가장 작은 절대값 출력 / 삭제
 */

import java.util.*;
import java.io.*;

public class Main_11286 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) ->{

            // 절댓값으로 변경//
            int fri = Math.abs(o1);
            int sec = Math.abs(o2);

            // 재배치 //
            if (fri == sec)
                // 더 큰 수의 우선순위를 낮춤
                return o1 > o2 ? 1 :-1;

            // 2번째가 더 클경우 음수가 반환됨 --> 음수의 우선순위가 높아짐
            return fri - sec;
        });

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num != 0) queue.add(num);
            else {
                if (queue.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(queue.poll());
            }
        }
    }
}
