package org.example.solution.programers.lv2.p87946;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_87946Test {
    @Test
    void no1() {
        Solution_87946 S = new Solution_87946();
        int k = 80;
        int[][] dun = {{80,20},{50,40},{30,10}};
        int a = 3;
        assertThat(S.solution(k, dun)).isEqualTo(a);
    }
    @Test
    void no2() {
        Solution_87946 S = new Solution_87946();
        int k = 40;
        int[][] dun = {{40,20},{10,10},{10,10},{10,10},{10,10}};
        int a = 4;
        assertThat(S.solution(k, dun)).isEqualTo(a);
    }
}