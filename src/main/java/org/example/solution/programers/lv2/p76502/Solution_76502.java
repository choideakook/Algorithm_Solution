package org.example.solution.programers.lv2.p76502;

/**
 * 괄호 회전하기
 * s = String array ( 1 ~ 1,000 )
 * x = 회전 ( 0 ~ s length )
 */
import java.util.*;

public class Solution_76502 {
    public int solution(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                String sub1 = s.substring(0, i);
                String sub2 = s.substring(i);
                s = sub2 + sub1;
                break;
            }
            if (i == s.length() - 1) return 0;
        }
        return calculator(1, s.length() - 1,  s + s);
    }
    int calculator(int start, int limit, String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <= limit; i++) {
            char cha = s.charAt(i);

            if (cha == '(' || cha == '{' || cha == '[')
                stack.add(cha);

            else {
                if (stack.isEmpty()) return 0;
                else if (stack.peek() == '(' && cha == ')') stack.pop();
                else if (stack.peek() == '{' && cha == '}') stack.pop();
                else if (stack.peek() == '[' && cha == ']') stack.pop();
                else return 0;
            }
        }
        int answer = 1;

        while (start <= limit) {
            char cha1 = s.charAt(start);
            char cha2 = s.charAt(start + limit);
            start++;

            if (cha1 == '(' || cha1 == '{' || cha1 == '[')
                if (cha2 == ')' || cha2 == '}' || cha2 == ']')
                    answer++;
        }
        return answer;
    }
}
