package org.example.solution.baekjoon.b2992;

import java.io.*;
import java.util.*;

public class Main_2992_2 {
    static int X;
    static int[] ogs, arr;
    static boolean[] visit;
    static String str, answer = "";

    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        str = sb.readLine();
        X = Integer.parseInt(str);
        visit = new boolean[str.length() + 1];

        ogs = new int[str.length()];
        arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ogs[i] = str.charAt(i) - '0';
            arr[i] = str.charAt(i) - '0';
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (visit[arr.length]) break;
            BT(i);
        }

        if (!visit[arr.length])
            System.out.println(0);
    }

    private static void BT(int i) {
        String add = answer + arr[i];
        int index = Integer.parseInt(add);
        int og = Integer.parseInt(str.substring(0, add.length()));

        if (!visit[i] && index >= og) {
            visit[i] = true;
            answer = String.valueOf(index);
        } else return;

        for (int j = 0; j < arr.length; j++) {
            if (!visit[j]) BT(j);
            if (visit[arr.length]) return;
        }

        if (Integer.parseInt(answer.toString()) > X) {
            System.out.println(answer);
            visit[arr.length] = true;
        } else {
            visit[i] = false;
            answer = answer.substring(0, answer.length() - 1);
        }
    }
}