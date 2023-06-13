package org.example.solution.b1546;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;
        long max = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (max < num) max = num;
            sum += num;
        }

        // 100.0 으로 소숫점을 하나 붙여주면 자동으로 double 로 변경된다.
        System.out.println(sum * 100.0 / max / N);
    }

    /**
     * N <= 1000
     * M * point / 100 = new point
     */
    public double solution(int N, int... points) {

        int sum = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            if (max < points[i]) max = points[i];
            sum += points[i];
        }

        return sum * 100.0 / max / N;
    }
}
