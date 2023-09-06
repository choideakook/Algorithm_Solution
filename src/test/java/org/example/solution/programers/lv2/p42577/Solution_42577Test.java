package org.example.solution.programers.lv2.p42577;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_42577Test {
    @Test
    void no1() {
        Solution_42577 S = new Solution_42577();
        String[] book = {"119", "97674223", "1195524421"};
        assertThat(S.solution(book)).isEqualTo(false);
    }
    @Test
    void no2() {
        Solution_42577 S = new Solution_42577();
        String[] book = {"123","456","789"};
        assertThat(S.solution(book)).isEqualTo(true);
    }
    @Test
    void no3() {
        Solution_42577 S = new Solution_42577();
        String[] book = {"12","123","1235","567","88"};
        assertThat(S.solution(book)).isEqualTo(false);
    }

}