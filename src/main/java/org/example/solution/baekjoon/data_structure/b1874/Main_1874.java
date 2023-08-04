package org.example.solution.baekjoon.data_structure.b1874;

/**
 * 스택 수열
 *
 * 1 <= n <= 1 00,000 : 총 길이
 *
 */

import java.util.*;

public class Main_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int count = 1;


        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            while (num > stack.peek()){
                stack.push(count);
                list.add("+");
                count++;
            }

            if (num == stack.peek()){
                stack.pop();
                list.add("-");
            }
            else if (num < stack.peek()) {
                list.clear();
                list.add("NO");
                break;
            }
        }

        for(String result : list)
            System.out.println(result);
    }
}