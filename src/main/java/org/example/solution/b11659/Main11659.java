package org.example.solution.b11659;

import java.util.Scanner;

public class Main11659 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] sum = new int[N];
        sum[0] = sc.nextInt();

        for (int i = 1; i < N; i++)
            sum[i] = sum[i - 1] + sc.nextInt();

        for (int i = 0; i < M; i++) {
            int fir = sc.nextInt();
            int last = sc.nextInt();
            int answer = 0;

            try {
                answer = sum[last - 1] - sum[fir - 2];
            } catch (Exception e) {
                answer = sum[last - 1];
            }
            System.out.println(answer);
        }

    }

    public int[] solution(int N, int M, int[] num, int[][] terms) {
        int[] answer = new int[M];
        int[] sum = new int[N];
        sum[0] = num[0];

        for (int i = 1; i < N; i++)
            sum[i] = sum[i - 1] + num[i];

        for (int i = 0; i < M; i++)
            answer[i] = sum[terms[i][1] - 1] - sum[terms[i][0] - 2];


        return answer;
    }
}
