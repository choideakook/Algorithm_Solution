package org.example.solution.programers.lv2.p1844;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_1844Test {
    @Test
    void no1() {
        Solution_1844 S = new Solution_1844();
        int[][] map = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int ans = 11;
        assertThat(S.solution(map)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_1844 S = new Solution_1844();
        int[][] map = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        int ans = -1;
        assertThat(S.solution(map)).isEqualTo(ans);
    }
}