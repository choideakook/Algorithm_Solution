package org.example.solution.programers.lv2.p131127;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_131127Test {
    @Test
    void no1() {
        Solution_131127 S = new Solution_131127();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] num = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        assertThat(S.solution(want, num, discount)).isEqualTo(3);
    }
    @Test
    void no2() {
        Solution_131127 S = new Solution_131127();
        String[] want = {"apple"};
        int[] num = {10};
        String[] discount = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};
        assertThat(S.solution(want, num, discount)).isEqualTo(0);
    }
}