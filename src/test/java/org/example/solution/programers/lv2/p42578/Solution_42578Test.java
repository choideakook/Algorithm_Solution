package org.example.solution.programers.lv2.p42578;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_42578Test {
    @Test
    void no1() {
        Solution_42578 S = new Solution_42578();
        String[][] param = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        assertThat(S.solution(param)).isEqualTo(5);
    }

    @Test
    void no2() {
        Solution_42578 S = new Solution_42578();
        String[][] param = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        assertThat(S.solution(param)).isEqualTo(3);
    }
}