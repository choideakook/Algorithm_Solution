package org.example.solution.baekjoon.backTracking.b2661;

/**
 * 좋은 수열
 * 시간 1초
 * N[] ( 1 ~ 80 )
 */

import java.util.*;

public class Main_2661 {
    static int N;
    static StringBuilder sb = new StringBuilder("12");
    static String index = "1";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        if (N == 1) System.out.println(1);
        else {
            DFS("2", index);
            System.out.println(sb);
        }
    }

    static boolean DFS(String key, String value) {
        int aSize = sb.length();

        if (N == aSize) return true;
        if (key.equals(value)) {
            indexAdder();
            return false;
        }

        int vSize = value.length() + 1;
        int kSize = aSize - key.length();

        if (kSize < vSize) {
            String K = index;
            sb.append(index);

            if (!DFS(K, indexReset()));
                if (!DFS(K, index))
                    if (!DFS(K, index)) {
                        sb.deleteCharAt(sb.length() - 1);
                        return false;
                    }
        }
        else {
            int end = aSize - key.length();
            String K = sb.substring(end - vSize, end);
            String V = key.substring(key.length() - 1) + value;
            return DFS(K, V);
        }
        return true;
    }

    static void indexAdder() {
        switch (index) {
            case "1" -> index = "2";
            case "2" -> index = "3";
            default -> index = "1";
        }
    }

    static String indexReset() {
        index = "1";
        return index;
    }
}