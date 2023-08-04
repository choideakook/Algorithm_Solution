package org.example.solution.baekjoon.sort.b2751;

/**
 * Counting Sort 로 풀이
 *
 * Collections.sort 는 1452 ms / 129532 kb 인 반면
 * Counting Sort 는 744 ms / 94120 kb 로 매우 효율적으로 문제가 해결되었다.
 */

import java.io.*;

public class Main_2751_1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[2000001];

        for(int i = 0; i < N; i++)
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;

        for(int i = 0; i < arr.length; i++)
            if (arr[i])
                sb.append(i - 1000000).append('\n');

        System.out.println(sb);
    }
}
