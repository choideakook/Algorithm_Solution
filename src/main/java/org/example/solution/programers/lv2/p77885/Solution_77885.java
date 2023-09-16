package org.example.solution.programers.lv2.p77885;

/**
 * 2개 이하로 다른 비트
 * numbers ( 1 ~100,000 )
 * index ( 0 ~ 1,000,000,000,000,000 )
 */

import java.util.*;

public class Solution_77885 {
    String[] bit = new String[100001];

    public long[] solution(long[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = answer(numbers[i]);

        return numbers;
    }
    long answer(long num) {
        StringBuilder sb = new StringBuilder(Long.toString(num, 2));

        long i = num;
        while (++i > i) {

        }
    }
}
