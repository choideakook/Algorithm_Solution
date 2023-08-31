package org.example.solution.programers.lv2.p12924;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_12924Test {
    @Test
    void no1() {
        Solution_12924 S = new Solution_12924();
        assertThat(S.solution(15)).isEqualTo(4);
    }

    @Test
    void no2() {
        Solution_12924 S = new Solution_12924();
        assertThat(S.solution(10)).isEqualTo(2);
    }
}