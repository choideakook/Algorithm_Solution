package org.example.solution.jungol.star.j1523;

/**
 * 별삼각형 1
 * 시간 1,000 ms
 *
 * N = high ( 1 ~ 100 )
 * M = kind
 *
 */

import java.util.*;

public class Main_1523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N > 100)
            System.out.println("INPUT ERROR!");

        else if (M == 1) kind1(N);

        else if (M == 2) kind2(N);

        else if (M == 3) kind3(N);

        else System.out.println("INPUT ERROR!");
    }
    static void kind1 (int N){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("*");
            System.out.println(sb);
        }
    }
    static void kind2 (int N){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++)
            sb.append("*");

        for (int i = N - 1; i >= 0 ; i--) {
            System.out.println(sb);
            sb.deleteCharAt(i);
        }
    }
    static void kind3 (int N){
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < N; i++)
            sb.append(" ");

        sb.append("*");
        System.out.println(sb);

        for (int i = 1; i < N; i++) {
            sb.deleteCharAt(0);
            sb.append("**");
            System.out.println(sb);
        }
    }
}
