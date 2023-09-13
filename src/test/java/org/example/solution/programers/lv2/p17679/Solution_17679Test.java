package org.example.solution.programers.lv2.p17679;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_17679Test {
    @Test
    void no1() {
        Solution_17679 S = new Solution_17679();
        int m = 4;
        int n = 5;
        String[] boa = {
                "CCBDE",
                "AAADE",
                "AAABF",
                "CCBBF"};
        int ans = 14;
        assertThat(S.solution(m, n, boa)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_17679 S = new Solution_17679();
        int m = 6;
        int n = 6;
        String[] boa = {
                "TTTANT",
                "RRFACC",
                "RRRFCC",
                "TRRRAA",
                "TTMMMF",
                "TMMTTJ"};
        int ans = 15;
        assertThat(S.solution(m, n, boa)).isEqualTo(ans);
    }
}