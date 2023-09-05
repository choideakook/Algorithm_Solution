package org.example.solution.programers.lv2.p42586;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_42586Test {
    @Test
    void no1() {
        Solution_42586 S = new Solution_42586();
        int[] pro = {93, 30, 55};
        int[] spe = {1, 30, 5};
        int[] ans = {2, 1};
        assertThat(S.solution(pro, spe)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_42586 S = new Solution_42586();
        int[] pro = {95, 90, 99, 99, 80, 99};
        int[] spe = {1, 1, 1, 1, 1, 1};
        int[] ans = {1, 3, 2};
        assertThat(S.solution(pro, spe)).isEqualTo(ans);
    }
    @Test
    void no3() {
        Solution_42586 S = new Solution_42586();
        int[] pro = {100, 100, 100};
        int[] spe = {1, 1, 1};
        int[] ans = {3};
        assertThat(S.solution(pro, spe)).isEqualTo(ans);
    }
    @Test
    void no4() {
        Solution_42586 S = new Solution_42586();
        int[] pro = {99};
        int[] spe = {1};
        int[] ans = {1};
        assertThat(S.solution(pro, spe)).isEqualTo(ans);
    }
}