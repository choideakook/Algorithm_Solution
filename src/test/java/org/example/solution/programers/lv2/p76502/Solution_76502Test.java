package org.example.solution.programers.lv2.p76502;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_76502Test {
    @Test
    void no() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("{")).isEqualTo(0);
    }
    @Test
    void no1() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("[](){}")).isEqualTo(3);
    }
    @Test
    void no2() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("}]()[{")).isEqualTo(2);
    }
    @Test
    void no3() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("[)(]")).isEqualTo(0);
    }
    @Test
    void no4() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("}}}")).isEqualTo(0);
    }
}