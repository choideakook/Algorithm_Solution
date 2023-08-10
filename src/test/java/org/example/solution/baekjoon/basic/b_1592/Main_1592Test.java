package org.example.solution.baekjoon.basic.b_1592;


import org.junit.jupiter.api.Test;

class Main_1592Test {
    @Test
    void no1() {

        int i = 3 % 2;
        int j = 4 % 2;

        System.out.println(i + " / " +j);
    }

    @Test
    void no2() {
        int i = 3;
        int j = 4;

        j += - i;

        System.out.println(j);
    }
}