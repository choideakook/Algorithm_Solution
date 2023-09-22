package org.example.solution.baekjoon.backTracking.b2661;

import java.util.Scanner;

public class Ans_2661 {
    int start = 1;
    int end = 3;
    int n;
    String ans;

    public String mmain(int N) {
//        Scanner scan = new Scanner(System.in);

        n = N;
        backtracking("");
        return ans;
    }

    public void backtracking(String str) {
        if(str.length() == n) {
            ans = str;
            return;
//            System.exit(0);
        }

        for(int i = start; i <= end; i++) {
            if(can_make_str(str + i)) backtracking(str + i);
        }
    }

    public boolean can_make_str(String str) {
        for(int i = 1; i <= str.length() / 2; i++) {
            String front = str.substring(str.length() -i * 2, str.length() - i);
            String back = str.substring(str.length() - i, str.length());
            if(front.equals(back)) return false;
        }
        return true;
    }
}