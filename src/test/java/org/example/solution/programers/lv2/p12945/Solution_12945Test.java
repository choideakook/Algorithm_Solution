package org.example.solution.programers.lv2.p12945;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_12945Test {
    @Test
    void no1() {
        Solution_12945 S = new Solution_12945();
        assertThat(S.solution(3)).isEqualTo(2);
    }
    @Test
    void no2() {
        Solution_12945 S = new Solution_12945();
        assertThat(S.solution(5)).isEqualTo(5);
    }

    @Test
    void no3() {
        Solution_12945 S = new Solution_12945();
        assertThat(S.solution(50)).isEqualTo(5);
    }
    @Test
    void no0() {
        int i = 10;
        long k = i;

        System.out.println(k);
    }
}