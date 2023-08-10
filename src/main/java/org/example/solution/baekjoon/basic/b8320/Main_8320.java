package org.example.solution.baekjoon.basic.b8320;

/**
 * 직사각형을 만드는 방법
 * 시간 : 1초
 *
 * N = count ( 1 ~ 10,000 )
 */

import java.util.*;

public class Main_8320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++)
            for (int j = i; j * i <= N; j++)
                count++;

        System.out.println(count);
    }
}
