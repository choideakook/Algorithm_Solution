package org.example.solution.baekjoon.greedy.b5585;

/**
 * 거스름돈
 * 시간 1초
 *
 * M = money ( 1 ~ 1,000 )
 */

import java.util.*;

public class Main_5585 {
    static int[] coin = {500, 100, 50, 10, 5, 1};
    static int money, count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        money = 1000 - sc.nextInt();

        for (int i : coin)
            if (i <= money)
                count += greedy(i);

        System.out.println(count);
    }
    static int greedy(int coin) {
        int num = money / coin;
        money = money % coin;
        return num;
    }
}
