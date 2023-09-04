package org.example.solution.programers.lv2.p17680;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_17680Test {
    @Test
    void no1() {
        Solution_17680 S = new Solution_17680();
        int size = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int answer = 50;
        assertThat(S.solution(size, cities)).isEqualTo(answer);
    }
    @Test
    void no2() {
        Solution_17680 S = new Solution_17680();
        int size =3 ;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        int answer =21 ;
        assertThat(S.solution(size, cities)).isEqualTo(answer);
    }
    @Test
    void no3() {
        Solution_17680 S = new Solution_17680();
        int size =2 ;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int answer =60 ;
        assertThat(S.solution(size, cities)).isEqualTo(answer);
    }
    @Test
    void no4() {
        Solution_17680 S = new Solution_17680();
        int size = 5;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int answer = 52;
        assertThat(S.solution(size, cities)).isEqualTo(answer);
    }
    @Test
    void no5() {
        Solution_17680 S = new Solution_17680();
        int size = 2;
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
        int answer = 16;
        assertThat(S.solution(size, cities)).isEqualTo(answer);
    }
    @Test
    void no6() {
        Solution_17680 S = new Solution_17680();
        int size = 0;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int answer = 25;
        assertThat(S.solution(size, cities)).isEqualTo(answer);
    }
    @Test
    void no7() {
        Solution_17680 S = new Solution_17680();
        int size = 3;
        String[] cities = {"1","2","1","1","1","1"};
        int answer = 14;
        assertThat(S.solution(size, cities)).isEqualTo(answer);
    }
    @Test
    void no8() {
        Solution_17680 S = new Solution_17680();
        int size = 2;
        String[] cities = {"a", "a", "a", "b", "b", "b", "c", "c", "c"};
        int answer = 21;
        assertThat(S.solution(size, cities)).isEqualTo(answer);
    }
}