package org.example.solution.baekjoon.basic.b17413;

/**
 * 단어 뒤집기 2
 * 시간 : 1초
 * <p>
 * S = String ( a -z / 0 - 9 / ' ' / < > )
 * 1 <= S <= 100,000
 */

import java.util.*;

public class Main_17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.nextLine());
        String str = S.toString();
        boolean check = false;
        int count = 0;

        ArrayList<String> list = new ArrayList<>();

        while (str.contains("<")) {
            int start = S.indexOf("<");
            int end = S.indexOf(">") + 1;

            list.add(str.substring(start, end));
            S.replace(start, end, " & ");
            str = S.toString();
        }

        String[] arr = str.split(" ");
        S.setLength(0);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("")) continue;

            else if (arr[i].equals("&")) {
                S.append(list.get(count));
                check = false;
                count++;
            }

            else {
                StringBuilder reverse = new StringBuilder(arr[i]);
                if (check) S.append(" ");
                S.append(reverse.reverse());
                check = true;
            }
        }
        System.out.println(S);
    }
}
