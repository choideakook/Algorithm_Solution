package org.example.solution.programers.lv2.p42587;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_42587Test {
    @Test
    void no1() {
        Solution_42587 S = new Solution_42587();
        int[] pri = {2, 1, 3, 2};
        assertThat(S.solution(pri, 2)).isEqualTo(1);
    }
    @Test
    void no2() {
        Solution_42587 S = new Solution_42587();
        int[] pri = {1, 1, 9, 1, 1, 1};
        assertThat(S.solution(pri, 0)).isEqualTo(5);
    }
    @Test
    void no3() {
        Solution_42587 S = new Solution_42587();
        int[] pri = {1, 1, 1, 1, 1, 1};
        assertThat(S.solution(pri, 3)).isEqualTo(4);
    }
}