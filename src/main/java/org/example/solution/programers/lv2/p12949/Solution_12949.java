package org.example.solution.programers.lv2.p12949;

/**
 * 행렬의 곱샘
 * arr1, arr2 length ( 2 ~ 100 )
 * index ( -10 ~ 20 )
 */
public class Solution_12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2[0].length; j++)
                for (int k = 0; k < arr1[0].length; k++)
                    answer[i][j] += arr1[i][k] * arr2[k][j];

        return answer;
    }
}
