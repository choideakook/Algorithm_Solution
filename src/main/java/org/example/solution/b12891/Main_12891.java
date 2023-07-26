package org.example.solution.b12891;

/**
 * BAEKJOON - DNA 비밀번호
 * <p>
 * S = 임의의 문자열 길이
 * P = 부분 문자열 길이
 * dna = 부분 문자열
 * A , C , G , T 의 최소 포함 조건
 */

import java.util.*;
import java.io.*;

public class Main_12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(tk.nextToken());
        int P = Integer.parseInt(tk.nextToken());

        tk = new StringTokenizer(br.readLine());
        String dna = tk.nextToken();

        tk = new StringTokenizer(br.readLine());
        ArrayList<Integer> term = new ArrayList<>();
        for (int i = 0; i < 4; i++)
            term.add(Integer.parseInt(tk.nextToken()));

        int str = 0, end = P, count = 0;

        while (end <= S) {
            String pw = dna.substring(str, end);
            boolean check = false;

            if (pw.replace("A", "").length() <= P - term.get(0)
                    && pw.replace("C", "").length() <= P - term.get(1)
                    && pw.replace("G", "").length() <= P - term.get(2)
                    && pw.replace("T", "").length() <= P - term.get(3)
            ) check = true;

            if (check) count++;
            str++;
            end++;
        }

        System.out.println(count);
    }
}
