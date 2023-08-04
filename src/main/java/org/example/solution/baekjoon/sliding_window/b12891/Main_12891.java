package org.example.solution.baekjoon.sliding_window.b12891;

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

    int[] passwd = new int[4];

    public static void main(String[] args) throws IOException {
        System.out.println(new Main_12891().solution());
    }

    public int solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(tk.nextToken());
        int P = Integer.parseInt(tk.nextToken()) - 1;

        tk = new StringTokenizer(br.readLine());
        String dna = tk.nextToken();

        tk = new StringTokenizer(br.readLine());
        int[] standard = new int[4];
        for (int i = 0; i < 4; i++)
            standard[i] = Integer.parseInt(tk.nextToken());

        char[] chars = dna.substring(0, P + 1).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            add(chars[i]);
        }

        int count = 0;
        for (int i = P; i < S; i++) {
            if (
                    standard[0] <= passwd[0] &&
                    standard[1] <= passwd[1] &&
                    standard[2] <= passwd[2] &&
                    standard[3] <= passwd[3]
            ) count++;

            if (i + 1 < S){
                add(dna.charAt(i + 1));
                remove(dna.charAt(i - P));
            }
        }
        return count;
    }

    void add(char cha) {
        if (cha == 'A') passwd[0]++;
        else if (cha == 'C') passwd[1]++;
        else if (cha == 'G') passwd[2]++;
        else passwd[3]++;
    }

    void remove(char cha) {
        if (cha == 'A') passwd[0]--;
        else if (cha == 'C') passwd[1]--;
        else if (cha == 'G') passwd[2]--;
        else passwd[3]--;
    }
}
