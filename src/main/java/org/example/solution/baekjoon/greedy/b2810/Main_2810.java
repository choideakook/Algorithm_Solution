package org.example.solution.baekjoon.greedy.b2810;

/**
 * 컵홀더
 * 시간 1초
 *
 * N = cup
 * S = single
 * L = couple
 */
import java.util.*;

public class Main_2810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        String seat = sc.next();
        int couple = seat.replace("S", "").length();
        int single = seat.length() - couple;

        if (N <= single) count += N;

        else {
            count += single;
            N -= single;

            couple = (couple / 2) + 1;
            count += couple >= N ? N : couple;
        }
        System.out.println(count);
    }
}
