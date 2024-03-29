package org.example.solution.programers.lv2.p138476;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_138476Test {
    @Test
    void no1() {
        Solution_138476 S = new Solution_138476();
        assertThat(S.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3})).isEqualTo(3);
    }
    @Test
    void no2() {
        Solution_138476 S = new Solution_138476();
        assertThat(S.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3})).isEqualTo(2);
    }
    @Test
    void no3() {
        Solution_138476 S = new Solution_138476();
        assertThat(S.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3})).isEqualTo(1);
    }
    @Test
    void no4() {
        Solution_138476 S = new Solution_138476();
        assertThat(S.solution(1, new int[]{1})).isEqualTo(1);
    }
    @Test
    void no5() {
        Solution_138476 S = new Solution_138476();

        int[] arr = new int[100000];
        for (int i = 0; i < 99999; i++) arr[i] = 1;
        arr[99999] = 2;
        assertThat(S.solution(100000, arr)).isEqualTo(2);
    }
}