package org.example.solution.programers.lv2.p49993;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_49993Test {
    @Test
    void no1() {
        Solution_49993 S = new Solution_49993();
        String ski = "CBD";
        String[] skt = {"BACDE", "CBADF", "AECB", "BDA"};
        int ans = 2;
        assertThat(S.solution(ski, skt)).isEqualTo(ans);
    }
}