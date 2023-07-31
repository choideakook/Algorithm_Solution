package org.example.solution.algorithm;

/**
 * 병합 정렬
 */

import java.io.*;

public class MergeSort {

    public static int[] solution(int[] arr) {
        // 임시 저장 배열
        int[] tmp = new int[arr.length];

        // 실질적인 business logic
        mergeSort(arr, tmp, 0, arr.length - 1);
        return arr;
    }


    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {

        if (start < end) {

            // 배열의 반을 자르기 위한 변수
            int mid = (start + end) / 2;

            //-- 본격적인 로직 시작 --//

            // 왼쪽 배열 정렬
            mergeSort(arr, tmp, start, mid);

            // 오른쪽 배열 정렬
            mergeSort(arr, tmp, mid + 1, end);

            // 두 배열 병합
            merge(arr, tmp, start, mid, end);
        }
    }

    //-- 배열 병합 method --//
    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {

        for (int i = start; i <= end; i++) tmp[i] = arr[i];

        // 임시 배열 pointer 생성
        int part1 = start, part2 = mid + 1;

        // 원본 배열 pointer 생성
        int index = start;


        while (part1 <= mid && part2 <= end) {
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }

        for(int i = 0; i <= mid - part1; i++)
            arr[index + i] = tmp[part1 + i];
    }
}
