package org.example.solution.programers.lv2.p17684;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_17684Test {
    @Test
    void no1() {
        Solution_17684 S = new Solution_17684();
        String msg = "KAKAO";
        int[] ans = {11, 1, 27, 15};
        assertThat(S.solution(msg)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_17684 S = new Solution_17684();
        String msg = "TOBEORNOTTOBEORTOBEORNOT";
        int[] ans = {20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34};
        assertThat(S.solution(msg)).isEqualTo(ans);
    }
    @Test
    void no3() {
        Solution_17684 S = new Solution_17684();
        String msg = "ABABABABABABABAB";
        int[] ans = {1, 2, 27, 29, 28, 31, 30};
        assertThat(S.solution(msg)).isEqualTo(ans);
    }
}