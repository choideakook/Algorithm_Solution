package org.example.solution.baekjoon.greedy.b1202;

/**
 * 보석 도둑
 * 시간 1초
 *
 * N = total length ( 1 ~ 300,000 )
 * M = weight ( 0 ~ 1,000,000 )
 * V = price ( 0 ~ 1,000,000 )
 *
 * K = bag ( 1 ~ 300,000 )
 * C = capa ( 1 ~ 100,000,000 )
 */

import java.util.*;
import java.io.*;

public class Main_1202 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        long result = 0;

        ArrayList<Long> bags = new ArrayList<>();
        long[][] gems = new long[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            gems[i][0] = Long.parseLong(st.nextToken());
            gems[i][1] = Long.parseLong(st.nextToken());
        }
        for (int i = 0; i < K; i++)
            bags.add(Long.parseLong(br.readLine()));

        Collections.sort(bags);
        Arrays.sort(gems, new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                if (o1[0] == o2[0])
                    return (int) (o2[1] - o1[1]);
                return (int) (o1[0] - o2[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            if (bags.size() == 0) break;

            for (int j = 0; j < bags.size(); j++)
                if (gems[i][0] <= bags.get(j)) {
                    result += gems[i][1];
                    bags.remove(j);
                }
        }
        System.out.println(result);
    }
}
