package org.example.solution.programers.lv2.p76502_X;

/**
 * 괄호 회전하기
 * s = String array ( 1 ~ 1,000 )
 * x = 회전 ( 0 ~ s length )
 */

import java.util.*;

public class Solution_76502 {
    Stack<Character> stack = new Stack<>();

    public int solution(String s) {

        s = strSetting(s);
        if (s.length() == 0) return 0;

        for (int i = 0; i < s.length(); i++)
            if (!stackCal(s.charAt(i))) return 0;
        if (!stack.isEmpty()) return 0;

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            stackCal(s.charAt(i));
            if (stack.isEmpty()) answer++;
        }
        return answer;
    }

    String strSetting(String s) {
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                String sub1 = s.substring(0, i);
                String sub2 = s.substring(i);
                return sub2 + sub1;
            }
        return "";
    }

    boolean stackCal(char cha) {
        if (cha == '(' || cha == '{' || cha == '[')
            stack.add(cha);

        else {
            if (stack.isEmpty()) return false;
            else if (stack.peek() == '(' && cha == ')') stack.pop();
            else if (stack.peek() == '{' && cha == '}') stack.pop();
            else if (stack.peek() == '[' && cha == ']') stack.pop();
            else return false;
        }
        return true;
    }
}