package org.example.solution.baekjoon.b11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11659 {

    public static void main(String[] args) throws IOException {

        // 숫자가 클 경우 scanner 보다 String 으로 받아서 int 로 캐스팅 하는 게 더 효율이 좋다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());

        // 큰수를 연산해야 될 경우 int 의 범위를 넘어버리는 경우가 있을 수 있기 때문에 long 형으로 선언하는것이 좋다.
        long[] sum = new long[N + 1];
        sum[0] = 0;

        for (int i = 1; i <= N; i++)
            sum[i] = sum[i - 1] + Integer.parseInt(tk.nextToken());

        for (int i = 0; i < M; i++) {
            int fir = Integer.parseInt(tk.nextToken());
            int last = Integer.parseInt(tk.nextToken());

            System.out.println(sum[last] - sum[fir - 1]);
        }
    }

    public int[] solution(int N, int M, int[] num, int[][] terms) {
        int[] answer = new int[M];

        return answer;
    }
}
