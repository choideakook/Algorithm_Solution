package org.example.solution.programers.lv2.p92335;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_92335Test {
    @Test
    void no1() {
        Solution_92335 S = new Solution_92335();
        int n = 437674;
        int k = 3;
        int a = 3;
        assertThat(S.solution(n, k)).isEqualTo(a);
    }
    @Test
    void no2() {
        Solution_92335 S = new Solution_92335();
        int n = 110011;
        int k = 10;
        int a = 2;
        assertThat(S.solution(n, k)).isEqualTo(a);
    }
}