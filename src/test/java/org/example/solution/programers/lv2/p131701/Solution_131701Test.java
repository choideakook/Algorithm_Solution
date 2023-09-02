package org.example.solution.programers.lv2.p131701;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_131701Test {
    @Test
    void no1() {
        Solution_131701 S = new Solution_131701();
        assertThat(S.solution(new int[]{7, 9, 1, 1, 4})).isEqualTo(18);
    }
}