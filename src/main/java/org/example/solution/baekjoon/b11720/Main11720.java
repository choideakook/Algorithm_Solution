package org.example.solution.baekjoon.b11720;

import java.util.*;

public class Main11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        char[] chars = sc.next().toCharArray();
        long sum = 0;

        for(char cha : chars)
            sum += cha - '0';

        System.out.println(sum);
        sc.close();
    }
}
