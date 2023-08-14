package org.example.solution.baekjoon.greedy.b1541;

/**
 * 잃어버린 괄호
 * 시간 제한 2초
 *
 * N = 식 ( N.length <= 50)
 * M = 정수 ( 0 <= M <= 9999)
 *
 * 100-40+50+74-30+29-45+43+11
 * 100 - (40+50+74 = 164) - (30+29 = 59) - (45+43+11 = 99) = -222
 */

import java.util.*;

public class Main_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();

        String[] split = N.split("-");
        int result = 0;

        for (int i = 0; i < split.length; i++) {
            String[] A = split[i].split("\\+");
            int sum = 0;

            for (int j = 0; j < A.length; j++) {
                sum += Integer.parseInt(A[j]);
            }

            result -= result == 0 ? sum * -1 : sum;
        }
        System.out.println(result);
    }
}

