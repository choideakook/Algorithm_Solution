package org.example.solution.programers.lv2.p92341;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_92341Test {
    @Test
    void no1() {
        Solution_92341 S = new Solution_92341();
        int[] fe = {180, 5000, 10, 600};
        String[] rec = {
                "05:34 5961 IN", "06:00 0000 IN",
                "06:34 0000 OUT", "07:59 5961 OUT",
                "07:59 0148 IN", "18:59 0000 IN",
                "19:09 0148 OUT", "22:59 5961 IN",
                "23:00 5961 OUT"
        };
        int[] ans = {14600, 34400, 5000};
        assertThat(S.solution(fe, rec)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_92341 S = new Solution_92341();
        int[] fe = {120, 0, 60, 591};
        String[] rec = {
                "16:00 3961 IN",
                "16:00 0202 IN",
                "18:00 3961 OUT",
                "18:00 0202 OUT",
                "23:58 3961 IN"
        };
        int[] ans = {0, 591};
        assertThat(S.solution(fe, rec)).isEqualTo(ans);
    }
    @Test
    void no3() {
        Solution_92341 S = new Solution_92341();
        int[] fe = {1, 461, 1, 10};
        String[] rec = {"00:00 1234 IN"};
        int[] ans = {14841};
        assertThat(S.solution(fe, rec)).isEqualTo(ans);
    }
}