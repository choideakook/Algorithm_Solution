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
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1 ,o2) ->{
            if (o1[0] == o2[0])
                return o1[0] - o2[0];
            return o1[1] - o2[1];
        });

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            queue.add(new int[] {A, B});
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(queue.poll()[1]);
        boolean check = false;

        while (!queue.isEmpty()){
            int[] poll = queue.poll();

            for(int i = 0; i < list.size(); i++){
                if (list.get(i) <= poll[0]){
                    list.set(i, poll[1]);
                    check = true;
                    break;
                }
            }
            if (check){
                check = false;
                continue;
            }
            list.add(poll[1]);
        }
        System.out.println(list.size());
    }
}
