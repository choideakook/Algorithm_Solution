package org.example.solution.swea.basic.s7272_X;

/**
 * 안경이 없어
 * 시간 제한 2초
 * <p>
 * T = test case
 * 문자열 길이 <= 10
 * CEFGHIJKLMNSTUVWXYZ = 0
 * ADOPQR = 1
 * B =2
 */

import java.util.*;
import java.io.*;

public class Main_7272 {
    static ArrayList<Character> term = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String one = "ADOPQR";

        for (int i = 0; i < 6; i++)
            term.add(one.charAt(i));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] A = st.nextToken().toCharArray();
            char[] B = st.nextToken().toCharArray();

            if (A.length != B.length) result(i, false);
            boolean check = true;

            for (int j = 0; j < A.length; j++){
                int replaceA = replace(A[j]);
                int replaceB = replace(B[j]);

                if (replaceA != replaceB){
                    check = false;
                    break;
                }
            }
            result(i, check);
        }
    }

    static int replace(char cha) {
        if (cha == 'B') return 3;
        else if (term.contains(cha)) return 2;
        else return 1;
    }
    static void result(int i, boolean result) {
        if (result)
            System.out.println("#" + i + " SAME");
        else
            System.out.println("#" + i + " DIFF");
    }
}
