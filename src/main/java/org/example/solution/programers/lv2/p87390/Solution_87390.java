package org.example.solution.programers.lv2.p87390;

/**
 * n^2 배열 자르기
 * n = 2차원 배열 길이 ( 1 ~ 10,000,000 )
 * left = start index ( 0 ~ right )
 * right ( left ~ n^2 )
 *
 * right - left < 100,000
 */
public class Solution_87390 {
    public int[] solution(int n, long left, long right) {
        int length = (int) (right - left + 1);
        int[] answer = new int[length];
        int Y = (int) (left / n);
        int X = (int) (left % n);

        for (int i = 0; i < answer.length; i++) {
            if (Y <= X) answer[i] = X + 1;
            else answer[i] = Y + 1;

            if (X < n - 1) X++;
            else {
                X = 0;
                Y++;
            }
        }
        return answer;
    }
}
