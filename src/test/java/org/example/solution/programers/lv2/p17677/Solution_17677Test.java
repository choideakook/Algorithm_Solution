package org.example.solution.programers.lv2.p17677;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_17677Test {
    @Test
    void no1() {
        Solution_17677 S = new Solution_17677();
        String str1 = "FRANCE";
        String str2 = "french";
        int answer = 16384;
        assertThat(S.solution(str1, str2)).isEqualTo(answer);
    }
    @Test
    void no2() {
        Solution_17677 S = new Solution_17677();
        String str1 = "handshake";
        String str2 = "shake hands";
        int answer = 65536;
        assertThat(S.solution(str1, str2)).isEqualTo(answer);
    }
    @Test
    void no3() {
        Solution_17677 S = new Solution_17677();
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";
        int answer = 43690;
        assertThat(S.solution(str1, str2)).isEqualTo(answer);
    }
    @Test
    void no4() {
        Solution_17677 S = new Solution_17677();
        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";
        int answer = 65536;
        assertThat(S.solution(str1, str2)).isEqualTo(answer);
    }
    @Test
    void no5() {
        Solution_17677 S = new Solution_17677();
        String str1 = "AAbbaa_AAbb";
        String str2 = "BBB";
        int answer = 16384;
        assertThat(S.solution(str1, str2)).isEqualTo(answer);
    }
    @Test
    void no6() {
        Solution_17677 S = new Solution_17677();
        String str1 = "abab";
        String str2 = "baba";
        int answer = 32768;
        assertThat(S.solution(str1, str2)).isEqualTo(answer);
    }
}