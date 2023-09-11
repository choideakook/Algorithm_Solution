package org.example.solution.programers.lv2.p12913;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_12913Test {
    @Test
    void no1() {
        Solution_12913 S = new Solution_12913();
        int[][] lan = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        int ans = 16;
        assertThat(S.solution(lan)).isEqualTo(ans);
    }

    @Test
    void no2() {
        Solution_12913 S = new Solution_12913();
        int[][] lan = {
                {1, 2, 3, 4},
                {10, 6, 8, 9},
                {19, 1, 1, 20},
                {1, 1, 1, 10}};
        int ans = 41;
        assertThat(S.solution(lan)).isEqualTo(ans);
    }
    @Test
    void no3() {
        Solution_12913 S = new Solution_12913();
        int[][] lan = {
                {1, 4, 3, 1},
                {1, 3, 4, 1},
                {1, 1, 10, 1},
                {1, 3, 4, 1},
                {1, 4, 3, 1}};
        int ans = 22;
        assertThat(S.solution(lan)).isEqualTo(ans);
    }
}