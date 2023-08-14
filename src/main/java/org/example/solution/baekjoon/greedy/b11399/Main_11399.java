package org.example.solution.baekjoon.greedy.b11399;

/**
 * ATM
 * 시간 제한 : 1초
 *
 * N = waiting ( 1 ~ 1,000 )
 * P = working time
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Long> P = new ArrayList<>();

        for (int i = 0; i < N; i++)
            P.add(Long.parseLong(st.nextToken()));

        Collections.sort(P);
        long result = P.get(0);
        long sum = result;

        for(int i = 1; i < P.size(); i++){
            sum += P.get(i);
            result += sum;
        }

        System.out.println(result);
    }
}
