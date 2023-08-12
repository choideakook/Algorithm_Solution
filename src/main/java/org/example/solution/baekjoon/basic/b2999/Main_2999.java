package org.example.solution.baekjoon.basic.b2999;

/**
 * 비밀 이메일
 * 시간 1초
 * <p>
 * N = length ( 1 ~ 100 )
 * R = row
 * C = column
 * <p>
 * R <= C
 * R * C = N
 */

import java.util.*;

public class Main_2999 {
    static int N, C, R;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        N = str.length();
        R = N / 2;

        map();

        if (R * C == 0)
            System.out.println(str);

        else {
            String[] row = new String[R];
            for (int i = 0; i < R; i++)
                row[i] = str.substring(i * C, (i + 1) * C);

            for (int i = 0; i < C; i++)
                for (int j = 0; j < R; j++)
                    sb.append(row[j].charAt(i));

            System.out.println(sb);
        }
    }
    static void map() {
        for (int i = R; i > 1; i--) {
            for (int j = i; j * i <= N; j++)
                if (j * i == N) {
                    C = i;
                    R = j;
                    return;
                }
        }
    }
}
