package org.example.solution.programers.lv2.p42583;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_42583Test {
    @Test
    void no1() {
        Solution_42583 S = new Solution_42583();
        int len = 2;
        int wei = 10;
        int[] tru = {7,4,5,6};
        int ans = 8;
        assertThat(S.solution(len, wei, tru)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_42583 S = new Solution_42583();
        int len = 100;
        int wei = 100;
        int[] tru = {10};
        int ans = 101;
        assertThat(S.solution(len, wei, tru)).isEqualTo(ans);
    }
    @Test
    void no3() {
        Solution_42583 S = new Solution_42583();
        int len = 100;
        int wei = 100;
        int[] tru = {10,10,10,10,10,10,10,10,10,10};
        int ans = 110;
        assertThat(S.solution(len, wei, tru)).isEqualTo(ans);
    }
}