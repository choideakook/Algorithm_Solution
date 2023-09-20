package org.example.solution.programers.lv2.p42746;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_42746Test {
    @Test
    void no1() {
        Solution_42746 S = new Solution_42746();
        int[] num = {6, 10, 2};
        String ans = "6210";
        assertThat(S.solution(num)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_42746 S = new Solution_42746();
        int[] num = {3, 30, 34, 5, 9};
        String ans = "9534330";
        assertThat(S.solution(num)).isEqualTo(ans);
    }
    @Test
    void no3() {
        Solution_42746 S = new Solution_42746();
        int[] num = {3, 30, 34, 2};
        String ans = "343230";
        assertThat(S.solution(num)).isEqualTo(ans);
    }
    @Test
    void no4() {
        Solution_42746 S = new Solution_42746();
        int[] num = {3, 30, 2, 1};
        String ans = "32301";
        assertThat(S.solution(num)).isEqualTo(ans);
    }
    @Test
    void no5() {
        Solution_42746 S = new Solution_42746();
        int[] num = {3, 40, 30, 34, 2, 1};
        String ans = "403432301";
        assertThat(S.solution(num)).isEqualTo(ans);
    }
}