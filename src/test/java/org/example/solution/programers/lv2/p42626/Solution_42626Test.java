package org.example.solution.programers.lv2.p42626;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_42626Test {
    @Test
    void no1() {
        Solution_42626 S = new Solution_42626();
        int[] sco = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int ans = 2;
        assertThat(S.solution(sco, k)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_42626 S = new Solution_42626();
        int[] sco = {1, 2, 3, 9, 10, 12};
        int k = 99999;
        int ans = -1;
        assertThat(S.solution(sco, k)).isEqualTo(ans);
    }
}