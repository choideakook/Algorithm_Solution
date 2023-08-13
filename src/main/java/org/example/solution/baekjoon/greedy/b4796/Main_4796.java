package org.example.solution.baekjoon.greedy.b4796;

/**
 * 캠핑
 * 시간 1초
 *
 * P = max day
 * L = available day
 * V = vacation
 * 1 < L < P < V
 */

import java.util.*;
import java.io.*;

public class Main_4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Case = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if (L + P + V == 0) break;

            int result = (V / P) * L;
            int rest = V % P;

            if (rest >= L) result+= L;
            else result += rest;

            System.out.println("Case " + Case + ": " + result);
            Case++;
        }
    }
}
