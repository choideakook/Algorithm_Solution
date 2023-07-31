package org.example.solution.algorithm;

/**
 * arr 의 범위 : -1,000,000 <= arr <= 1,000,000
 *
 * 같은 값을 가지는 index 가 없을 때 사용 가능하다.
 * O(n) 으로 매우 빠른 시간복잡도를 갖는다.
 */
public class CountingSort {
    public static int[] solution(int[] arr) {
        boolean[] A = new boolean[2000001];

        for(int i = 0; i < arr.length; i++)
            A[arr[i] + 1000000] = true;

        int index = 0;
        for(int i = 0; i < A.length; i++)
            if (A[i]){
                arr[index] = i - 1000000;
                index++;
            }

        return arr;
    }
}
