package org.example.solution.baekjoon.greedy.b1541;

/**
 * 잃어버린 괄호
 * 시간 2초
 */

import java.util.*;

public class Main_1541_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] split = sc.next().split("-");
        int[] sums = new int[split.length];
        int result = 0;

        for(int i = 0; i < split.length; i++){
            String[] sum = split[i].split("\\+");

            for(String str : sum)
                sums[i] += Integer.parseInt(str);

            result -= i != 0 ? sums[i] : - sums[i];
        }
        System.out.println(result);
    }
}
