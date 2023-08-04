package org.example.solution.baekjoon.data_structure.b1920;

/**
 * 수 찾기
 * 시간 제한 1초
 * <p>
 * N = length ( 1 <= N <= 100,000 )
 * M = 확인할 수 ( 1 <= M <= 100,000 )
 */

import java.io.*;
import java.util.*;

public class Main_1920 {

    static int target;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            target = Integer.parseInt(st.nextToken());
            binary(0, N - 1);
        }
    }

    static void binary(int start, int end) {

        if (target < list.get(start) && target > list.get(end)) {
            System.out.println(0);
            return;
        }

        while(true) {
            int mid = (start + end) / 2;

            if (target == list.get(mid)) {
                System.out.println(1);
                break;
            }

            else if (start == end){
                System.out.println(0);
                break;
            }

            else if (target < list.get(mid)) end = mid - 1;

            else if (target > list.get(mid)) start = mid + 1;
        }
    }
}
