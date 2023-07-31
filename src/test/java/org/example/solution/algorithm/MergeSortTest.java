package org.example.solution.algorithm;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortTest {

    @Test
    void no1() {
        int[] solution = MergeSort.solution(new int[]{3, 9, 4, 7, 5, 0, 1, 6, 8, 2});
        assertThat(solution).isEqualTo(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    void no2() {
        int[] solution = MergeSort.solution(new int[]{3, 1, 2, 4});
        assertThat(solution).isEqualTo(new int[]{1, 2, 3, 4});
    }
}