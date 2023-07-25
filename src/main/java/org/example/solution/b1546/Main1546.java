package org.example.solution.b1546;

import java.util.*;

public class Main1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int max = 0, sum = 0;

        for(int i = 0; i < length; i++) {
            int num = sc.nextInt();
            if (max < num) max = num;
            sum += num;
        }

        System.out.println((sum * 100) / max / length);

    }
}
