package org.example.solution.programers.lv2.p77885;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_77885Test {
    @Test
    void no1() {
        Solution_77885 S = new Solution_77885();
        long[] num = {2, 7};
        long[] ans = {3, 11};
        assertThat(S.solution(num)).isEqualTo(ans);
    }
}