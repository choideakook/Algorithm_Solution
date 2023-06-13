package org.example.solution.b11659;

import java.util.Scanner;

public class Main11659 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] sum = new int[N + 1];
        sum[0] = 0;

        for (int i = 1; i <= N; i++)
            sum[i] = sum[i - 1] + sc.nextInt();

        for (int i = 0; i < M; i++) {
            int fir = sc.nextInt();
            int last = sc.nextInt();

            System.out.println(sum[last] - sum[fir - 1]);
        }

    }

    public int[] solution(int N, int M, int[] num, int[][] terms) {
        int[] answer = new int[M];

        return answer;
    }
}
