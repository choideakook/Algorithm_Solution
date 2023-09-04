package org.example.solution.programers.lv2.p64065;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_64065Test {
    @Test
    void no1() {
        Solution_64065 S = new Solution_64065();
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] a = {2, 1, 3, 4};
        assertThat(S.solution(s)).isEqualTo(a);
    }
    @Test
    void no2() {
        Solution_64065 S = new Solution_64065();
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        int[] a = {2, 1, 3, 4};
        assertThat(S.solution(s)).isEqualTo(a);
    }
    @Test
    void no3() {
        Solution_64065 S = new Solution_64065();
        String s = "{{20,111},{111}}";
        int[] a = {111, 20};
        assertThat(S.solution(s)).isEqualTo(a);
    }
    @Test
    void no4() {
        Solution_64065 S = new Solution_64065();
        String s = "{{123}}";
        int[] a = {123};
        assertThat(S.solution(s)).isEqualTo(a);
    }
    @Test
    void no5() {
        Solution_64065 S = new Solution_64065();
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        int[] a = {3, 2, 4, 1};
        assertThat(S.solution(s)).isEqualTo(a);
    }


}