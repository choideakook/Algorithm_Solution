package org.example.solution.programers.lv2.p84512;

/**
 * 모음사전
 *
 */

public class Solution_84512 {
    public int solution(String word) {
        int answer = 0;
        for (int i = 0; i < word.length(); i++)
            answer += casting(word.charAt(i), i);

        return answer + word.length();
    }
    int casting(char cha, int i) {
        int[] term = {781, 156, 31, 6, 1};
        int num = 0;
        switch (cha) {
            case 'E' -> num = 1;
            case 'I' -> num = 2;
            case 'O' -> num = 3;
            case 'U' -> num = 4;
            default -> {return 0;}
        }
        return num * term[i];
    }
}
