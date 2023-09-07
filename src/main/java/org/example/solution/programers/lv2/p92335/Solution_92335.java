package org.example.solution.programers.lv2.p92335;

/**
 * k 진수에서 소수 개수 구하기
 * n ( 1 ~ 1,000,000 )
 * k ( 3 ~ 10 )
 */

public class Solution_92335 {
    public int solution(int n, int k) {
        String[] split = Integer
                .toString(n, k)
                .split("0");

        int answer = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("")) continue;
            long num = Long.parseLong(split[i]);
            boolean check = false;

            for (int j = 2; j < num; j++) {
                if (num % j == 0) break;
                if (j + 1 == num) check = true;
            }
            if (check || num == 2) answer++;
        }
        return answer;
    }
}
