package org.example.solution.programers.lv2.p17677;

/**
 * [1차]뉴스 클러스터링
 * 자카드 유사도 = 교집합 크기 / 합집합 크기
 * 공집합이면 return 1
 * str1,2 ( 2 ~ 1,000 )
 */

import java.util.*;

public class Solution_17677 {
    PriorityQueue<String> Q1 = new PriorityQueue<>();
    PriorityQueue<String> Q2 = new PriorityQueue<>();
    double union, inter;
    public int solution(String str1, String str2) {
        addQueue(str1, 0);
        addQueue(str2, 1);

        while (Q1.size() + Q2.size() != 0) {
            if (Q1.isEmpty()) {
                union += Q2.size();
                break;
            }
            else if (Q2.isEmpty()) {
                union += Q1.size();
                break;
            }
            compare(Q1.peek(), Q2.peek());
        }

        if (inter == 0) return 65536;
        return (int) Math.floor((inter / union) * 65536);
    }
    void addQueue(String str, int q) {
        for (int i = 0; i < str.length() - 1; i++) {
            String key = str.substring(i, i + 2)
                    .toLowerCase()
                    .replaceAll("[^a-z]", "");

            if (key.length() != 2) continue;
            if (q == 0) Q1.add(key);
            else Q2.add(key);
        }
    }
    void compare(String str1, String str2) {
        if (str1.equals(str2)) {
            Q1.poll();
            Q2.poll();
            union++;
            inter++;
        } else
            for (int i = 0; i < 2; i++) {
                char cha1 = str1.charAt(i);
                char cha2 = str2.charAt(i);

                if (cha1 == cha2) continue;
                if (cha1 > cha2) {
                    Q2.poll();
                    union++;
                    break;
                } else {
                    Q1.poll();
                    union++;
                    break;
                }
            }
    }
}
