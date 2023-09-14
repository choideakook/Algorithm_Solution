package org.example.solution.programers.lv2.p154538;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_154538Test {
    @Test
    void no1() {
        Solution_154538 S = new Solution_154538();
        int x = 10;
        int y = 40;
        int n = 5;
        int ans = 2;
        assertThat(S.solution(x, y, n)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_154538 S = new Solution_154538();
        int x = 10;
        int y = 40;
        int n = 30;
        int ans = 1;
        assertThat(S.solution(x, y, n)).isEqualTo(ans);
    }
    @Test
    void no3() {
        Solution_154538 S = new Solution_154538();
        int x = 2;
        int y = 5;
        int n = 4;
        int ans = -1;
        assertThat(S.solution(x, y, n)).isEqualTo(ans);
    }
}