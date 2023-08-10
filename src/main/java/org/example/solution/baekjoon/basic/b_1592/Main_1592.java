package org.example.solution.baekjoon.basic.b_1592;

/**
 * 영식이와 친구들
 * 시간 제한 2초
 *
 * N = player ( 3 ~ 50 )
 * M = end ( 1 ~ 50 )
 * L = throw ( 1 ~ N -1 )
 */

import java.util.*;

public class Main_1592 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int result = 0;
        int now = 1;

        int[] A = new int[N + 1];
        A[1]++;

        while (A[now] < M){
            now += (A[now] % 2) == 0 ?  L : - L;

            while (now < 1 || now > N)
                if (now < 1) now = N + now;
                else if (now > N) now = now - N;

            A[now]++;
            result++;
        }
        System.out.println(result);
    }
}
