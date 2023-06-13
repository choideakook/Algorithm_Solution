package org.example.solution.b1546;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1546Test {


    Solution1546 solution = new Solution1546();

    @Test
    void n1() {
        double result = solution.solution(3, 40, 80, 60);
        assertThat(result).isEqualTo(75.0);
    }

    @Test
    void n2() {
        double result = solution.solution(3, 10, 20, 30);
        assertThat(result).isEqualTo(66.66666666666667);
    }

    @Test
    void n3() {
        double result = solution.solution(4, 1, 100, 100, 100);
        assertThat(result).isEqualTo(75.25);
    }

    @Test
    void n4() {
        double result = solution.solution(5, 1,2,4,8,16);
        assertThat(result).isEqualTo(38.75);
    }

    @Test
    void n5() {
        double result = solution.solution(2,3,10);
        assertThat(result).isEqualTo(65.0);
    }

    @Test
    void n6() {
        double result = solution.solution(4,10,20,0,100);
        assertThat(result).isEqualTo(32.5);
    }

    @Test
    void n7() {
        double result = solution.solution(1,50);
        assertThat(result).isEqualTo(100.0);
    }

    @Test
    void n8() {
        double result = solution.solution(9,10,20,30,40,50,60,70,80,90);
        assertThat(result).isEqualTo(55.55555555555556);
    }
}