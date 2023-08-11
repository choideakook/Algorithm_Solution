package org.example.solution.jungol.star.j1719;

/**
 * 별삼각형2
 * 시간 1,000 ms
 *
 * N = high ( 1 ~ 100 )
 * M = kind ( 1 ~ 4 )
 */

import java.util.*;

public class Main_1719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int num = (N / 2) + 1;

        if (N > 100 || N % 2 == 0)
            System.out.println("INPUT ERROR!");

        else if (M == 1) kind1(num);

        else if (M == 2) kind2(num);

        else if (M == 3) kind3(num);

        else if (M == 4) kind4(num);

        else System.out.println("INPUT ERROR!");
    }

    static void kind1(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            sb.append("*");
            System.out.println(sb);
        }
        for (int i = 1; i < num; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
    }
    static void kind2(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++)
            sb.append(" ");

        for (int i = 0; i < num; i++) {
            sb.deleteCharAt(0);
            sb.append("*");
            System.out.println(sb);
        }
        for (int i = 1; i < num; i++) {
            sb.deleteCharAt(num - 1);
            sb.insert(0, " ");
            System.out.println(sb);
        }
    }
    static void kind3(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num * 2; i++)
            sb.append("*");
        sb.deleteCharAt(0);
        System.out.println(sb);

        for (int i = 1; i < num; i++) {
            sb.insert(0, " ");
            sb.delete(sb.length() - 2, sb.length());
            System.out.println(sb);
        }
        for (int i = 1; i < num; i++) {
            sb.deleteCharAt(0);
            sb.append("**");
            System.out.println(sb);
        }

    }
    static void kind4(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++)
            sb.append("*");
        System.out.println(sb);

        for (int i = 1; i < num; i++) {
            sb.insert(0, " ");
            sb.deleteCharAt(num - 1);
            System.out.println(sb);
        }
        for (int i = 1; i < num; i++) {
            sb.append("*");
            System.out.println(sb);
        }
    }
}
