package org.example.solution.baekjoon.greedy.b1744;

/**
 * 수 묶기
 * 시간 2초
 *
 * N = int array ( 1 ~ 50 )
 */

import java.util.*;

public class Main_1744 {
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> plus = new ArrayList<>();
        ArrayList<Integer> minus = new ArrayList<>();
        boolean zero = false;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num > 1) plus.add(num);
            else if (num == 1) result++;
            else if (num == 0) zero = true;
            else minus.add(num);
        }
        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(minus);

        mul(plus); mul(minus);

        if (plus.size() % 2 == 1)
            result += plus.get(plus.size() - 1);

        if (minus.size() % 2 == 1 && !zero)
            result += minus.get(minus.size() - 1);

        System.out.println(result);
    }
    static void mul(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i += 2)
            result += list.get(i - 1) * list.get(i);
    }
}
