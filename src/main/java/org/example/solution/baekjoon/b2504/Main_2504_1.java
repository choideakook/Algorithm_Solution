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
import java.io.*;
import java.util.stream.Collectors;

public class Main_2504_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = Arrays.stream(br.readLine().split(""))
                .collect(Collectors.toCollection(ArrayList::new));

        int answer = 0;
        Stack<String> stack = new Stack<>();
        String prev = "";
        int cur = 1;

        loop:
        for (String word : words) {

            switch (word) {

                //-- 여는 괄호 --//
                case "(" -> {
                    cur *= 2;
                    stack.push(word);
                }
                case "[" -> {
                    cur *= 3;
                    stack.push(word);
                }

                //-- 닫는 괄호 --//
                case ")" -> {
                    if (stack.isEmpty() || !stack.peek().equals("(")) {
                        answer = 0;
                        break loop;
                    } else if (prev.equals("("))
                        answer += cur;

                    stack.pop();
                    cur /= 2; // 왜 나누기 2를 하는거지?
                }
                case "]" -> {
                    if (stack.isEmpty() || !stack.peek().equals("[")) {
                        answer = 0;
                        break loop;
                    } else if (prev.equals("["))
                        answer += cur;

                    stack.pop();
                    cur /= 3; // 왜 나누기 3을 하는거지??
                }
            }
            prev = word;
        }
        if (!stack.isEmpty()) answer = 0;
        System.out.println(answer);
    }
}

