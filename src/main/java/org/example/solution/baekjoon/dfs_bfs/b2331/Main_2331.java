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


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> check = new HashMap<>();
        List<String> D = new ArrayList<>();

        String A = sc.next();
        int P = sc.nextInt();

        while (true) {
            if (!D.contains(A)) D.add(A);
            else
                if (check.get(A) == null) check.put(A, 1);

                else if (check.get(A) > 2) break;

                else check.put(A, check.get(A) + 1);

            int sum = 0;

            for(int i =0; i < A.length(); i++)
                sum += Math.pow(A.charAt(i) - '0', P);

            A = String.valueOf(sum);
        }

        for(String key : check.keySet())
            D.remove(key);

        System.out.println(D.size());
    }
}
