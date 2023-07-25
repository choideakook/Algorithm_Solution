package org.example.solution.b1546;

import org.junit.jupiter.api.Test;

class Solution1546Test {

    @Test
    void test() {

        int[] A = {15, 13, 10, 7, 3, 12};
        int[] S = new int[A.length];


        S[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            S[i] = S[i - 1] + A[i];
        }


        // 2 ~ 5
        int sum = S[5] - S[2 - 1];
        System.out.println(sum);
    }
}