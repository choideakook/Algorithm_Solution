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
            boolean check = true;

            for (int j = 2; j <= (int) Math.sqrt(num); j++)
                if (num % j == 0) {
                    check = false;
                    break;
                }
            if (check && num != 1) answer++;
        }
        return answer;
    }
}
