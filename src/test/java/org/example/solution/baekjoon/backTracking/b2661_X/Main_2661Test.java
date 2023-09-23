package org.example.solution.baekjoon.backTracking.b2661_X;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Main_2661Test {
    @Test
    void name() {

        int n = 7;

        Main_2661 my = new Main_2661();
        Ans_2661 an = new Ans_2661();

        String my_ans = my.mmain(n);
        String ans = an.mmain(n);


        System.out.println(my_ans);
        System.out.println(ans);
        Assertions.assertThat(my).isEqualTo(ans);
    }
}