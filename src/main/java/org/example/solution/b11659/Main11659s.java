package org.example.solution.b11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11659s {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());

        long[] S = new long[N + 1];

        S[0] = 0;
        for (int i = 1; i < N + 1; i++)
            S[i] = S[i - 1] + Integer.parseInt(tk.nextToken());

        for (int i = 0; i < M; i++){
            int start = Integer.parseInt(tk.nextToken());
            int end = Integer.parseInt(tk.nextToken());

            System.out.println(S[end] - S[start - 1]);
        }
    }

}
