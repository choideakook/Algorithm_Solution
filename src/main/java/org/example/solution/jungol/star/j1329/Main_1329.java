package org.example.solution.jungol.star.j1329;

/**
 * 별삼각형3
 * 시간 1,000 ms
 *
 * N = high ( 1 ~ 100 )
 */

import java.util.*;

public class Main_1329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N > 100 || N < 1 || N % 2 == 0)
            System.out.println("INPUT ERROR!");

        else {
            StringBuilder sb = new StringBuilder("*");
            System.out.println(sb);
            int num = (N / 2) + 1;

            for (int i = 1; i < num; i++) {
                sb.insert(0, " ");
                sb.append("**");
                System.out.println(sb);
            }

            for (int i = 1; i < num; i++) {
                sb.deleteCharAt(0);
                sb.delete(sb.length() - 2, sb.length());
                System.out.println(sb);
            }
        }
    }
}
