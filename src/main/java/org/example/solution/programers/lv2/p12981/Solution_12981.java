package org.example.solution.programers.lv2.p12981;

import java.util.ArrayList;

/**
 * n = length ( 2 ~ 10 )
 * words ( n ~ 100 )
 * word length ( 2 ~ 50 )
 * <p>
 * answer = {num, count}
 */
public class Solution_12981 {
    public int[] solution(int n, String[] words) {
        ArrayList<String> duplication = new ArrayList<>();
        duplication.add(words[0]);

        int[] player = new int[n + 1];
        int order = 2;
        player[1]++;

        for (int i = 1; i < words.length; i++) {
            player[order]++;
            if (duplication.contains(words[i]))
                return new int[] {order, player[order]};

            if (wordCheck(words[i - 1], words[i])) {
                order = ordering(order, n);
                duplication.add(words[i]);
            }
            else
                return new int[] {order, player[order]};
        }
        return new int[]{0, 0};
    }
    boolean wordCheck(String o1, String o2) {
        char c1 = o1.charAt(o1.length() - 1);
        char c2 = o2.charAt(0);

        if (c1 == c2) return true;
        else return false;
    }
    int ordering(int order, int n) {
        if (order + 1 > n) return 1;
        else return order + 1;
    }
}
