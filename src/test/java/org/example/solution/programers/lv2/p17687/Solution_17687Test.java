package org.example.solution.programers.lv2.p17687;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_17687Test {
    @Test
    void no1() {
        Solution_17687 S = new Solution_17687();
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;
        String ans = "0111";
        assertThat(S.solution(n, t, m, p)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_17687 S = new Solution_17687();
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 1;
        String ans = "02468ACE11111111";
        assertThat(S.solution(n, t, m, p)).isEqualTo(ans);
    }
    @Test
    void no3() {
        Solution_17687 S = new Solution_17687();
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 2;
        String ans = "13579BDF01234567";
        assertThat(S.solution(n, t, m, p)).isEqualTo(ans);
    }
//    @Test
//    void no1() {
//        Solution_17687 S = new Solution_17687();
//        int n = ;
//        int t = ;
//        int m = ;
//        int p = ;
//        String ans = ;
//        assertThat(S.solution(n, t, m, p)).isEqualTo(ans);
//    }
}