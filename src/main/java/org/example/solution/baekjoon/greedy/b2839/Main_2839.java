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
        int N = sc.nextInt();
        int result = -1;

        for (int i = 0; i < 5; i++) {
            int rest = N -(i * 3);

            if (rest % 5 == 0){
                result = i + (rest / 5);
                break;
            } else if (i * 3 > N) break;
        }
        System.out.println(result);
    }
}
