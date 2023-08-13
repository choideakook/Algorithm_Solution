package org.example.solution.baekjoon.greedy.b5585;

/**
 * 거스름돈
 * 시간 1초
 *
 * M = money ( 1 ~ 1,000 )
 */

import java.util.*;

public class Main_5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] coin = {500, 100, 50, 10, 5, 1};
        int money = 1000 - sc.nextInt();
        int count = 0;

        for (int i : coin)
            if (i <= money){
                count += money / i;
                money = money % i;
            }
        System.out.println(count);
    }
}
