package org.example.solution.programers.lv2.p154539;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_154539Test {
    @Test
    void no1() {
        Solution_154539 S = new Solution_154539();
        int[] num = {2, 3, 3, 5};
        int[] ans = {3, 5, 5, -1};
        assertThat(S.solution(num)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_154539 S = new Solution_154539();
        int[] num = {9, 1, 5, 3, 6, 2};
        int[] ans = {-1, 5, 6, 6, -1, -1};
        assertThat(S.solution(num)).isEqualTo(ans);
    }
}