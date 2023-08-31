package org.example.solution.programers.lv2.p12953;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_12953Test {
    @Test
    void no1() {
        Solution_12953 S = new Solution_12953();
        assertThat(S.solution(new int[]{2, 6, 8, 14})).isEqualTo(168);
    }
    @Test
    void no2() {
        Solution_12953 S = new Solution_12953();
        assertThat(S.solution(new int[]{1, 2, 3})).isEqualTo(6);
    }
}