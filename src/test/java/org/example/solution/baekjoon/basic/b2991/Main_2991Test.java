package org.example.solution.baekjoon.basic.b2991;

import org.junit.jupiter.api.Test;

class Main_2991Test {

    @Test
    void mo1() {
        int a = 2;
        int b = 2;
        int max = a + b;

        int target = 15;

        target = target % max;

        boolean dog = false;

        if (target > a) dog = true;

        System.out.println(dog);
    }
}