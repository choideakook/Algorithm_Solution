package org.example.solution.programers.lv2.p68936;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_68936Test {
    @Test
    void no1() {
        Solution_68936 S = new Solution_68936();
        int[][] arr = {
                {1,1,0,0},
                {1,0,0,0},
                {1,0,0,1},
                {1,1,1,1}
        };
        int[] ans = {4, 9};
        assertThat(S.solution(arr)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_68936 S = new Solution_68936();
        int[][] arr = {
                {1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1},
                {0,0,0,0,1,1,1,1},
                {0,1,0,0,1,1,1,1},
                {0,0,0,0,0,0,1,1},
                {0,0,0,0,0,0,0,1},
                {0,0,0,0,1,0,0,1},
                {0,0,0,0,1,1,1,1}
        };
        int[] ans = {10, 15};
        assertThat(S.solution(arr)).isEqualTo(ans);
    }
    @Test
    void no3() {
        Solution_68936 S = new Solution_68936();
        int[][] arr = {
                {1,1},
                {1,1}
        };
        int[] ans = {0, 1};
        assertThat(S.solution(arr)).isEqualTo(ans);
    }
}