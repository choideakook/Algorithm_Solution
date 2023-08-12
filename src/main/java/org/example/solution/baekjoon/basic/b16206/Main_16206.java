package org.example.solution.baekjoon.basic.b16206;

/**
 * 롤케이크
 * 시간 2초
 * <p>
 * N = cake ( 1 ~ 1,000 )
 * M = cut ( 1 ~ 1,000 )
 * A = cake length ( 1 ~ 1,000 )
 */

import java.util.*;
import java.io.*;

public class Main_16206 {
    static int M, result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> A2 = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int cake = Integer.parseInt(st.nextToken());

            if (cake < 10) continue;
            else if (cake == 10) result++;
            else if (cake % 10 == 0) A1.add(cake);
            else A2.add(cake);
        }
        cutting(A1);
        if (M > 0) cutting(A2);

        System.out.println(result);
    }

    static void cutting(ArrayList<Integer> list) {

        Collections.sort(list);

        for (int cake : list) {
            int div = cake / 10;
            int rest = cake % 10;

            if (div <= M) {
                result += div;
                M -= (rest == 0) ? div - 1 : div;
            }
            else {
                result += (cake - (10 * M) == 10) ? M + 1 : M;
                M = 0;
                break;
            }
        }
    }
}
