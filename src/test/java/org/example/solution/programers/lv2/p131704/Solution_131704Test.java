package org.example.solution.programers.lv2.p131704;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_131704Test {
    @Test
    void no1() {
        Solution_131704 S = new Solution_131704();
        int[] ord = {4, 3, 1, 2, 5};
        int ans = 2;
        assertThat(S.solution(ord)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_131704 S = new Solution_131704();
        int[] ord = {5, 4, 3, 2, 1};
        int ans = 5;
        assertThat(S.solution(ord)).isEqualTo(ans);
    }
    @Test
    void no3() {
        Solution_131704 S = new Solution_131704();
        int[] ord = {1, 2, 3, 4, 5};
        int ans = 5;
        assertThat(S.solution(ord)).isEqualTo(ans);
    }
}