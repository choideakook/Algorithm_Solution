package org.example.solution.p42860;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void BAA() {
        assertThat(solution.solution("BAA")).isEqualTo(1);
    }

    @Test
    void BBA() {
        assertThat(solution.solution("BBA")).isEqualTo(3);
    }

    @Test
    void ACA() {
        assertThat(solution.solution("ACA")).isEqualTo(3);
    }

    @Test
    void ZBA() {
        assertThat(solution.solution("ZBA")).isEqualTo(3);
    }
}