package org.example.solution.programers.lv2.p132265;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_132265Test {
    @Test
    void no1() {
        Solution_132265 S = new Solution_132265();
        int[] top = {1, 2, 1, 3, 1, 4, 1, 2};
        int ans = 2;
        assertThat(S.solution(top)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_132265 S = new Solution_132265();
        int[] top = {1, 2, 3, 1, 4};
        int ans = 0;
        assertThat(S.solution(top)).isEqualTo(ans);
    }
}