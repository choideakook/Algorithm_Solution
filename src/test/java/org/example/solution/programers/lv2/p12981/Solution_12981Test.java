package org.example.solution.programers.lv2.p12981;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_12981Test {
    @Test
    void no1() {
        Solution_12981 S = new Solution_12981();
        assertThat(S.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}))
                .isEqualTo(new int[]{3, 3});
    }
    @Test
    void no2() {
        Solution_12981 S = new Solution_12981();
        assertThat(S.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}))
                .isEqualTo(new int[]{0, 0});
    }
    @Test
    void no3() {
        Solution_12981 S = new Solution_12981();
        assertThat(S.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}))
                .isEqualTo(new int[]{1, 3});
    }
}