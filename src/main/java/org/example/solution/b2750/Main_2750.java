package org.example.solution.b2750;

/**
 * 수 정렬하기 - priority queue 로 풀어보기
 */

import java.io.*;
import java.util.*;

public class Main_2750 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tk.nextToken());
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++)
            queue.add(Integer.valueOf(br.readLine()));

        while (queue.size() > 0)
            System.out.println(queue.poll());
    }
}
