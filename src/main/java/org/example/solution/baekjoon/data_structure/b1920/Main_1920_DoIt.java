package org.example.solution.baekjoon.data_structure.b1920;

/**
 * 수 찾기
 * 시간 제한 1초
 */

import java.util.*;

public class Main_1920_DoIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        Arrays.sort(A);

        int M = sc.nextInt();

        for(int i = 0; i < M; i++){
            boolean find = false;
            int target = sc.nextInt();
            int start = 0, end = N -1;

            while (start <= end){
                int mid_index = (start + end) / 2;
                int mid_value = A[mid_index];

                if (mid_value > target) end = mid_index - 1;

                else if (mid_value < target) start = mid_index + 1;

                else {
                    find = true;
                    break;
                }
            }
            if (find) System.out.println(1);
            else System.out.println(0);
        }
    }
}
