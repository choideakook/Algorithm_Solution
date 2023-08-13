package org.example.solution.baekjoon.greedy.b2720;

/**
 * 세탁소 시장 동혁
 * 시간 1초
 * <p>
 * T = test case
 * C = cent ( 1$ = 100 cent / 1 ~ 500 )
 * <p>
 * Q = 25 C
 * D = 10 C
 * N = 5 C
 * P = 1 C
 */

import java.util.*;

public class Main_2720 {
    static int cent;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coin = {25, 10, 5, 1};
        int T = sc.nextInt();

        for (int j = T; j > 0; j--) {
            StringBuilder sb = new StringBuilder();
            cent = sc.nextInt();

            for (int i : coin)
                if (cent >= i) sb.append(cal(i));
                else sb.append("0 ");

            System.out.println(sb);
        }
    }
    static String cal(int coin) {
        String result = cent / coin + " ";
        cent = cent % coin;
        return result;
    }
}
