package org.example.solution.baekjoon.greedy.b2839;

/**
 * 설탕배달
 * 시간
 *
 * N = target ( 3 ~ 5,000 )
 * potion = 3 , 5
 */

import java.util.*;

public class Main_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] potion = {5, 3};
        int N = sc.nextInt();
        int result = 0;

        for(int i : potion){
            result += N / i;
            N = N % i;
        }

        if (N != 0) result = -1;
        System.out.println(result);
    }
}
