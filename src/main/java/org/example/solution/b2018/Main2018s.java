package org.example.solution.b2018;

import java.util.Scanner;

public class Main2018s {

    /**
     * N = 연속된 자연수의 합
     * 1 <= N <= 10,000,000
     * 15 = 15, 7+8, 4+5+6, 1+2+3+4+5 --> 4
     * 10 = 10, 1+2+3+4 --> 2
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int start = 0, end = 1, answer = 0;
        long sum = 1;

        while (N * 2 != start + end) {
            if (sum < N) {
                end++;
                sum += end;
            }
            else if (sum > N) {
                start++;
                sum -= start;
            }
            else {
                answer++;
                end++;
                sum += end;
            }
        }

        System.out.println(answer);
    }
}
