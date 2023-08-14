package org.example.solution.baekjoon.greedy.b11000;

/**
 * 강의실 배정
 * 시간 1초
 * <p>
 * N = class ( 1 ~ 200,000 )
 */

import java.util.*;
import java.io.*;

public class Main_11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0][1]);
        boolean check = false;

        for (int i = 1; i < N; i++) {
            int loop = list.size();

            for (int j = 0; j < loop; j++) {
                if (list.get(j) <= arr[i][0]) {
                    list.set(j, arr[i][1]);
                    check = true;
                    break;
                }
            }
            if (check){
                check = false;
                continue;
            }
            list.add(arr[i][1]);
        }
        System.out.println(list.size());
    }
}
