package org.example.solution.programers.lv2.p87390;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_87390Test {
    @Test
    void no() {
        Solution_87390 S = new Solution_87390();
//        assertThat(S.solution(, , )).isEqualTo();
    }
    @Test
    void no1() {
        Solution_87390 S = new Solution_87390();
        assertThat(S.solution(3, 2, 5)).isEqualTo(new int[]{3, 2, 2, 3});
    }
    @Test
    void no2() {
        Solution_87390 S = new Solution_87390();
        assertThat(S.solution(4, 7, 14)).isEqualTo(new int[]{4, 3, 3, 3, 4, 4, 4, 4});
    }
    @Test
    void no3() {
        Solution_87390 S = new Solution_87390();
        assertThat(S.solution(4, 0, 4)).isEqualTo(new int[]{1, 2, 3, 4});
    }
}