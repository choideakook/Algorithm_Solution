package org.example.solution.programers.lv2.p87946_X;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_87946Test {
    @Test
    void no1() {
        Solution_87946_2 S = new Solution_87946_2();
        int k = 80;
        int[][] dun = {{80,20},{50,40},{30,10}};
        int a = 3;
        assertThat(S.solution(k, dun)).isEqualTo(a);
    }
    @Test
    void no2() {
        Solution_87946_2 S = new Solution_87946_2();
        int k = 40;
        int[][] dun = {{40,20},{10,10},{10,10},{10,10},{10,10}};
        int a = 4;
        assertThat(S.solution(k, dun)).isEqualTo(a);
    }
    @Test
    void no3() {
        Solution_87946_2 S = new Solution_87946_2();
        int k = 4;
        int[][] dun = {{4,1},{2,1},{3,1},{1,1}};
        int a = 4;
        assertThat(S.solution(k, dun)).isEqualTo(a);
    }
}