package org.example.solution.programers.lv2.p42747;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_42747Test {
    @Test
    void no1() {
        Solution_42747 S = new Solution_42747();
        assertThat(S.solution(new int[]{3, 0, 6, 1, 5})).isEqualTo(3);
    }
    @Test
    void no2() {
        Solution_42747 S = new Solution_42747();
        assertThat(S.solution(new int[]{1})).isEqualTo(1);
    }
    @Test
    void no3() {
        Solution_42747 S = new Solution_42747();
        assertThat(S.solution(new int[]{0, 0, 1, 0, 0})).isEqualTo(0);
    }
    @Test
    void no4() {
        Solution_42747 S = new Solution_42747();
        assertThat(S.solution(new int[]{0, 5, 6, 7, 8})).isEqualTo(4);
    }
    @Test
    void no5() {
        Solution_42747 S = new Solution_42747();
        assertThat(S.solution(new int[]{6, 5, 5, 5, 3, 2, 1, 0})).isEqualTo(4);
    }
}