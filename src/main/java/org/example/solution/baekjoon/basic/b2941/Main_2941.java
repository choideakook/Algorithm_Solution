package org.example.solution.baekjoon.basic.b2941;

/**
 * 크로아티아 알파벳
 * 시간 1초
 *
 * str ( 1 ~ 100 )
 */

import java.util.*;

public class Main_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"dz=", "lj", "nj", "c=", "c-", "d-", "s=", "z="};
        String str = sc.next();

        for (int i = 0; i < arr.length; i++)
            str = str.replace(arr[i], "&");

        System.out.println(str.length());
    }
}
