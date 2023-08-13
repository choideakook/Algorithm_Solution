package org.example.solution.baekjoon.greedy.b10162;

/**
 * 전자레인지
 * 시간 1초
 * <p>
 * A, B, C = 300s, 60s, 10s
 * T = cooking time ( ss /
 */

import java.util.*;

public class Main_10162 {
    static int[] time = {300, 60, 10};
    static int T;
    public static void main(String[] args) {
        StringBuilder br = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        if (T % 10 != 0)
            System.out.println("-1");
        else {
            for (int i = 0; i < 3; i++)
                if (T >= time[i])
                    br.append(cal(time[i]) + " ");
                else
                    br.append("0 ");

            System.out.println(br);
        }
    }
    static int cal(int time) {
        int count = T / time;
        T = T % time;
        return count;
    }
}