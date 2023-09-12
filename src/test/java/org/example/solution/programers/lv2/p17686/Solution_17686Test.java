package org.example.solution.programers.lv2.p17686;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_17686Test {
    @Test
    void no1() {
        Solution_17686 S = new Solution_17686();
        String[] fil = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        String[] ans = {"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"};
        assertThat(S.solution(fil)).isEqualTo(ans);
    }
    @Test
    void no2() {
        Solution_17686 S = new Solution_17686();
        String[] fil = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        String[] ans = {"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"};
        assertThat(S.solution(fil)).isEqualTo(ans);
    }
    @Test
    void no3() {
        Solution_17686 S = new Solution_17686();
        String[] fil = {"F16", "F13", "S1"};
        String[] ans = {"F13", "F16", "S1"};
        assertThat(S.solution(fil)).isEqualTo(ans);
    }
}