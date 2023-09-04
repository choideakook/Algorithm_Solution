package org.example.solution.programers.lv2.p12949;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_12949Test {
    @Test
    void no1() {
        Solution_12949 S = new Solution_12949();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        int[][] answer = {{15, 15}, {15, 15}, {15, 15}};
        assertThat(S.solution(arr1, arr2)).isEqualTo(answer);
    }

    @Test
    void no2() {
        Solution_12949 S = new Solution_12949();
        int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        int[][] answer = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};
        assertThat(S.solution(arr1, arr2)).isEqualTo(answer);
    }

    @Test
    void no3() {
        Solution_12949 S = new Solution_12949();
        int[][] arr1 = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        int[][] arr2 = {{1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1}};
        int[][] answer = {{5, 5}, {5, 5}};
        assertThat(S.solution(arr1, arr2)).isEqualTo(answer);
    }
}