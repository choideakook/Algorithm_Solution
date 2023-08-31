package org.example.solution.programers.lv2.p4842;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_42842Test {
    @Test
    void no1() {
        Solution_42842 S = new Solution_42842();
        assertThat(S.solution(10, 2)).isEqualTo(new int[]{4, 3});
    }
    @Test
    void no2() {
        Solution_42842 S = new Solution_42842();
        assertThat(S.solution(8, 1)).isEqualTo(new int[]{3, 3});
    }
    @Test
    void no3() {
        Solution_42842 S = new Solution_42842();
        assertThat(S.solution(24, 24)).isEqualTo(new int[]{8, 6});
    }
    @Test
    void no4() {
        Solution_42842 S = new Solution_42842();
        assertThat(S.solution(12, 4)).isEqualTo(new int[]{4, 4});
    }
}