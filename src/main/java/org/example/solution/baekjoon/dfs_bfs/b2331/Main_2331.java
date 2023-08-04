package org.example.solution.baekjoon.dfs_bfs.b2331;

/**
 * 반복수열
 * 시간 제한 2초
 *
 * P = 거듭 제곱 ( 1 <= P <= 5)
 * D[] = 수열 ( 1 <= D[] <= 9,999)
 * D[n] = D[n - 1] 의 각 자리수를 P 번 곱한 수의 합
 */

import java.util.*;

public class Main_2331 {

    static ArrayList<String> D;
    static int P;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        D = new ArrayList<>();
        D.add(sc.next());
        P = sc.nextInt();

        String sum = cal(D.get(0));

        while (!D.contains(sum)){
            D.add(sum);
            sum = cal(sum);
        }

        D.remove(sum);
        System.out.println(D.size());
    }

    static String cal(String index) {
        int sum = 0;

        for (int i = 0; i < index.length(); i++){
            int num = index.charAt(i) - 0;
            sum += Math.pow(num, P);
        }
        return String.valueOf(sum);
    }
}
