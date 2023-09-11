package org.example.solution.programers.lv2.p17687;

/**
 * N 진수 게임
 * n = 진법 ( 2 ~ 16 )
 * t = target size ( 1 ~ 1,000 )
 * p = target number ( 1 ~ m )
 * m = member ( 2 ~ 100 )
 */

public class Solution_17687 {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();

        int i = 0;
        int tern = 1;
        while (answer.length() < t) {
            String str = Integer.toString(i, n).toUpperCase();

            for (int j = 0; j < str.length(); j++) {
                if (tern == p)
                    answer.append(str.charAt(j));
                if (answer.length() == t) break;
                tern = nextTern(tern, m);
            }
            i++;
        }
        return answer.toString();
    }
    int nextTern(int tern, int m) {
        return tern + 1 > m ? 1 : tern + 1;
    }
}
