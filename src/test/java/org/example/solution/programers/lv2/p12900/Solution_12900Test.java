package org.example.solution.programers.lv2.p12900;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_12900Test {
    @Test
    void no1() {
        Solution_12900 S = new Solution_12900();
        int n = 4;
        int a = 5;
        assertThat(S.solution(n)).isEqualTo(a);
    }
    @Test
    void no2() {
        Solution_12900 S = new Solution_12900();
        int n = 52;
        int a = 316290802;
        assertThat(S.solution(n)).isEqualTo(a);
    }
}