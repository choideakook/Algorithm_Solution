package org.example.solution.baekjoon.b2992;

/**
 * 크면서 작은 수
 * 시간 1초
 * X = 1 ~ 999,999
 */

import java.util.*;

public class Main_2992 {
    static PriorityQueue<Character> sort = new PriorityQueue<>();
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder(sc.next());
        char[] chars = sb.toString().toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            if (i == 0) sb.deleteCharAt(0);
            else if (chars[i] > chars[i - 1]) {
                addSet(2, chars[i - 1]);
                break;
            } else {
                addSet(1, chars[i]);
            }
        }

        if (sb.length() == 0)
            System.out.println(0);
        else {
            for (Character c : sort) sb.append(c);
            System.out.println(sb);
        }
    }

    static void addSet(int length, char index) {
        sb.deleteCharAt(sb.length() - length);
        sort.add(index);
    }
}
