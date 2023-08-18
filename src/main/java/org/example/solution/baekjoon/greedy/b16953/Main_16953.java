package org.example.solution.baekjoon.greedy.b16953;

/**
 * A -> B
 * 시간 2초
 *
 * A = start
 * B = goal
 * 1 ~ 1,000,000,000
 */

import java.util.*;

public class Main_16953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = 1;

        while (A < B) {
            if (B % 10 == 1)
                B = (int) ((B - 1) * 0.1);
            else if (B % 2 == 0)
                B = B / 2;
            else
                break;
            result++;
        }
        if (A == B)
            System.out.println(result);
        else
            System.out.println(-1);
    }
}
