package org.example.solution.programers.lv2.p43165;

/**
 * 타겟 넘버
 * numbers (2 ~ 20 )
 * index ( 1 ~ 50 )
 * target ( 1 ~ 1,000 )
 */
import java.util.*;

public class Solution_43165 {
    int[] arr;
    int answer, T;
    public int solution(int[] numbers, int target) {
        arr = numbers;
        T = target;
        DFS(0, 0);
        return answer;
    }
    void DFS(int num, int i) {

        if (i == arr.length) {
            if (T == num) answer++;
            else return;
        }
        else if ( i < arr.length) {
            DFS(num + arr[i], i + 1);
            DFS(num - arr[i], i + 1);
        }
    }
}
