package org.example.solution.baekjoon.greedy.b1744;

/**
 * 수 묶기
 * 시간 2초
 *
 * N = int array ( 1 ~ 50 )
 */

import java.util.*;

public class Main_1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        ArrayList<Integer> plus = new ArrayList<>();
        ArrayList<Integer> minus = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num > 1) plus.add(num);
            else if (num == 0) zero.add(0);
            else minus.add(num);
        }

        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(minus);

        for (int i = 1; i < plus.size(); i += 2)
            result += plus.get(i - 1) * plus.get(i);

        if (zero.size() > 0 && zero.size() <= minus.size() && minus.get(0) != 1)
            for (int i : zero)
                minus.remove(0);

        if (plus.size() % 2 == 1)
            minus.add(plus.get(plus.size() - 1));

        for (int i = 0; i < minus.size(); i++)
            result += minus.get(i);

        System.out.println(result);
    }
}
