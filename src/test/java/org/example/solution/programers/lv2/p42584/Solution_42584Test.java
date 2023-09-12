package org.example.solution.programers.lv2.p42584;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_42584Test {
    @Test
    void no1() {
        Solution_42584 S = new Solution_42584();
        int[] pri = {1, 2, 3, 2, 3};
        int[] ans = {4, 3, 1, 1, 0};
        assertThat(S.solution(pri)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_42584 S = new Solution_42584();
        int[] pri = {2, 2, 3, 1, 5};
        int[] ans = {3, 2, 1, 1, 0};
        assertThat(S.solution(pri)).isEqualTo(ans);
    }
}