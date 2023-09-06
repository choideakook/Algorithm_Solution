package org.example.solution.programers.lv2.p43165;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_43165Test {
    @Test
    void no1() {
        Solution_43165 S = new Solution_43165();
        int[] num = {1, 1, 1, 1, 1};
        int tar = 3;
        int ans = 5;
        assertThat(S.solution(num, tar)).isEqualTo(ans);
    }

    @Test
    void no2() {
        Solution_43165 S = new Solution_43165();
        int[] num = {4, 1, 2, 1};
        int tar = 4;
        int ans = 2;
        assertThat(S.solution(num, tar)).isEqualTo(ans);
    }
}