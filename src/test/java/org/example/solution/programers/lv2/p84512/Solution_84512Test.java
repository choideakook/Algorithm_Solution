package org.example.solution.programers.lv2.p84512;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_84512Test {
    @Test
    void no1() {
        Solution_84512 S = new Solution_84512();
        String word = "AAAAE";
        int ans = 6;
        assertThat(S.solution(word)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_84512 S = new Solution_84512();
        String word = "AAAE";
        int ans = 10;
        assertThat(S.solution(word)).isEqualTo(ans);
    }@Test
    void no3() {
        Solution_84512 S = new Solution_84512();
        String word = "I";
        int ans = 1563;
        assertThat(S.solution(word)).isEqualTo(ans);
    }@Test
    void no4() {
        Solution_84512 S = new Solution_84512();
        String word = "EIO";
        int ans = 1189;
        assertThat(S.solution(word)).isEqualTo(ans);
    }


}