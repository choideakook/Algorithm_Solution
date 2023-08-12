package org.example.solution.baekjoon.basic.b2991;

/**
 * 사나운 객
 * 시간 1초
 * <p>
 * A, C = attack
 * B, D = rest
 * P = post
 * M = milk
 * N = news
 * 1 ~ 999
 */

import java.util.*;
import java.io.*;

public class Main_2991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] term = {A + B, C + D, A, C};

        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++)
            list.add(Integer.parseInt(st.nextToken()));

        for(int visit : list){
            int count = 0;

            for (int i = 0; i < 2; i++) {
                int time = visit % term[i];
                if (time == 0) continue;
                else if (time <= term[i + 2]) count++;
            }
            System.out.println(count);
        }
    }
}
