package org.example.solution.b11659;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Main11659Test {

    Main11659 main = new Main11659();

    @Test
    void n() {
        int[] arr = {5, 4, 3, 2, 1};
        int[][] terms = {{1,3}, {2,4}, {5,5}};
        int[] answer = {12, 9, 1};
        assertThat(main.solution(5,3, arr,terms)).isEqualTo(answer);
    }
}