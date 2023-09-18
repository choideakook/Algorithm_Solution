package org.example.solution.programers.lv2.p131704;

/**
 * 택배상자
 * order ( 1 ~ 1,000,000 )
 * index ( 1 ~ length )
 */

import java.util.*;

public class Solution_131704 {
    Stack<Integer> stack = new Stack<>();
    int answer, num = 1;

    public int solution(int[] order) {

        for (int i = 0; i < order.length; i++)
            if (!roof(order[i])) break;

        return answer;
    }

    boolean roof(int order) {
        while (order != num)
            if (stack.isEmpty()) {
                stack.add(num);
                num++;
            } else if (stack.peek() == order) {
                stack.pop();
                answer++;
                return true;
            } else if (stack.peek() > order) {
                return false;
            } else {
                stack.add(num);
                num++;
            }
        num++;
        answer++;
        return true;
    }
}
