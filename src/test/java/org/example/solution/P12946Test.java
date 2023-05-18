package org.example.solution;

import org.example.solution.p12946.P12946;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class P12946Test {

    private P12946 solute = new P12946();

    @Test
    @DisplayName("n = 2 / 1 -> 2")
    void no1() {
        assertThat(solute.test(1,2,2))
                .isEqualTo(new int[][]{{1, 3}, {1, 2}, {3, 2}});
    }

    @Test
    @DisplayName("n = 2 / 1 -> 3")
    void no2() {
        assertThat(solute.test(1,3,2))
                .isEqualTo(new int[][]{{1, 2}, {1, 3}, {2, 3}});

    }

    @Test
    @DisplayName("n = 1 / 1 -> 3")
    void no3() {
        int n = 1;
        assertThat(solute.solution(n))
                .isEqualTo(new int[][]{{1, 3}});
    }

    @Test
    @DisplayName("n = 2 / 2 -> 1")
    void no4() {
        assertThat(solute.test(2,1,2))
                .isEqualTo(new int[][]{{2, 3}, {2, 1}, {3, 1}});

    }

    @Test
    @DisplayName("n = 3 / 1 -> 3")
    void no5() {
        int n = 3;
        assertThat(solute.solution(n))
                .isEqualTo(new int[][]{{1, 3}, {1, 2}, {3, 2}, {1, 3}, {2, 1}, {2, 3}, {1, 3}});
    }

    @Test
    @DisplayName("n = 4 / 1 -> 3")
    void no6() {
        int n = 4;
        assertThat(solute.solution(n))
                .isEqualTo(new int[][]{{1, 2}, {1, 3}, {2, 3}, {1, 2}, {3, 1}, {3, 2}, {1, 2}, {1, 3}, {2, 3}, {2, 1}, {3, 1}, {2, 3}, {1, 2}, {1, 3}, {2, 3}});
    }

    @Test
    @DisplayName("n = 15 / 1 -> 3")
    void no7() {
        int n = 15;

        int[][] solution = solute.solution(n);

        assertThat(solution.length)
                .isEqualTo(32767);
    }
}