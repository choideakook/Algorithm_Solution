package org.example.solution.baekjoon.greedy.b1339;

/**
 * 단어 수학
 * 시간 2초
 * <p>
 * N = word length ( 1 ~ 10 )
 */

import java.util.*;

public class Main_1339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        int[] arr = new int[26];

        for (int i = 0; i < N; i++) {
            String str= sc.next();
            int length = str.length();

            for (int j = 0; j < length; j++)
                arr[str.charAt(j) - 'A'] += (int) Math.pow(10, length - j - 1);
        }
        Arrays.sort(arr);

        for (int i = 0; i < 10; i++)
            result += (9 -i) * arr[25 - i];

        System.out.println(result);
    }
}
