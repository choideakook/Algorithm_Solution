package org.example.solution.baekjoon.dp.b11722;

/**
 * 가장 긴 감소하는 부분 수열
 * 시간 1초
 *
 * A = 수열 ( 1 ~ 1,000 )
 * a = A's index ( 1 ~ 1,000 )
 */

import java.util.*;
import java.io.*;

public class Main_11722 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] D = new int[1002];

        StringTokenizer st = new StringTokenizer(br.readLine());
        D[0] = Integer.parseInt(st.nextToken());
        int result = 1;

        for (int i = 1; i < N; i++) {
            int index = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 1001; j++)
                if (D[j] < index) {
                    D[j] = index;
                    if (D[j + 1] == 0) result = j + 1;
                    break;
                }else if (D[j] == index)
                    break;
        }
        System.out.println(result);
    }
}
