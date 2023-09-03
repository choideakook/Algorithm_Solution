package org.example.solution.programers.lv2.p131127;

/**
 * 할인 행사
 * want, number ( 1 ~ 10 )
 * number index 의 합 = 10
 *
 * discount ( 10 ~ 100,000 )
 * want 와 discount 의 index 길이 ( 1 ~ 12 )
 */
import java.util.*;

public class Solution_131127 {
    Map<String, Integer> target = new HashMap<>();
    Map<String, Integer> sale = new HashMap<>();
    int sum = 0, answer = 0;
    public int solution(String[] want, int[] number, String[] discount) {
        for (int i = 0; i < want.length; i++) {
            target.put(want[i], number[i]);
            sale.put(want[i], 0);
        }

        for (int i = 0; i < 10; i++)
            for (int j = 0; j < want.length; j++)
                if (targetCheck(want[j], discount[i], 1)) break;

        if (sum == 10)
            if (answerCheck()) answer++;

        for (int i = 0; i < discount.length - 10; i++) {
            for (int j = 0; j < want.length; j++)
                if (targetCheck(want[j], discount[i], - 1)) break;

            for (int j = 0; j < want.length; j++)
                if (targetCheck(want[j], discount[i + 10], 1)) break;

            if (sum == 10)
                if (answerCheck()) answer++;
        }
        return answer;
    }
    boolean targetCheck(String want, String product, int count) {
        if (want.equals(product)) {
            sale.put(product, sale.get(product) + count);
            sum += count;
            return true;
        }
        return false;
    }
    boolean answerCheck() {
        for (String key : target.keySet()) {
            if (target.get(key) != sale.get(key))
                return false;
        }
        return true;
    }
}