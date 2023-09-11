package org.example.solution.programers.lv2.p49994;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_49994Test {
    @Test
    void no1() {
        Solution_49994 S = new Solution_49994();
        String dir = "ULURRDLLU";
        int ans = 7;
        assertThat(S.solution(dir)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_49994 S = new Solution_49994();
        String dir = "LULLLLLLU";
        int ans = 7;
        assertThat(S.solution(dir)).isEqualTo(ans);
    }
}