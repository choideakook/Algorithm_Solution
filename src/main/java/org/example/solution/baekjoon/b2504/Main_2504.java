package org.example.solution.baekjoon.b2504;

/**
 * 괄호의 값
 * 제한 시간 : 1초
 *
 * () = 2
 * [] = 3
 * ()() = 2 + 2
 * (()) = 2 * 2
 *
 * 1 <= X <= 30
 */

import java.util.*;

public class Main_2504 {
    static Stack<Character> stack1;
    static Stack<Integer> stack2;
    static Stack<Character> stack3;
    static boolean cal;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] X = sc.next().toCharArray();
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        stack3 = new Stack<>();
        boolean check = true;

        for (int i = 0; i < X.length; i++) {

            if (stack1.isEmpty()){
                if(X[i] == '(') {
                    push(X[i], 2);
                    cal = false;
                } else if (X[i] == '[') {
                    push(X[i], 3);
                    cal = false;
                } else {
                    check = false;
                    break;
                }
            }
            else if (stack1.peek() == '(') {
                if (X[i] == ')'){
                    cal = true;
                    stack1.pop();
                } else if (X[i] == ']') {
                    check = false;
                    break;
                }else if (X[i] == '['){
                    push(X[i], 3);
                    cal = false;
                }else {
                    push(X[i], 2);
                    cal = false;
                }
            }
            else if (stack1.peek() == '[') {
                if (X[i] == ']'){
                    cal = true;
                    stack1.pop();
                } else if (X[i] == ')') {
                    check = false;
                    break;
                }else if (X[i] == '['){
                    push(X[i], 3);
                    cal = false;
                }else {
                    push(X[i], 2);
                    cal = false;
                }
            }
        }

        int result = 0;
        if (check) {
            result += stack2.pop();

            for (int i = 1; i < X.length / 2; i++)
                if (stack3.peek() == '+');
        }

        System.out.println(result);
    }

    static void push(char st1, int st2){
        stack1.push(st1);
        stack2.push(st2);

        if (stack2.size() > 1){
            if (cal) stack3.push('+');
            else stack3.push('*');
        }
    }
}


