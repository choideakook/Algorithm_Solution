package org.example.solution.programers.lv2.p42885;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_42885Test {
    @Test
    void no1() {
        Solution_42885 S = new Solution_42885();
        assertThat(S.solution(new int[]{70, 50, 80, 50}, 100)).isEqualTo(3);
    }
    @Test
    void no2() {
        Solution_42885 S = new Solution_42885();
        assertThat(S.solution(new int[]{70, 80, 50}, 100)).isEqualTo(3);
    }
}