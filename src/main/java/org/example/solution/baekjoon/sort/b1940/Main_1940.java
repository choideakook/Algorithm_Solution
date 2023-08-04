package org.example.solution.baekjoon.sort.b1940;

import java.util.*;
import java.io.*;

public class Main_1940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt((tk.nextToken()));

        tk = new StringTokenizer(br.readLine());
        long M = Long.parseLong(tk.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        tk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt((tk.nextToken())));

        Collections.sort(list);

        int str = 0, end = N - 1, count = 0;

        while (str < end) {

            int sum = list.get(str) + list.get(end);

            if (sum < M) str++;
            else if (sum > M) end--;
            else{
                count++;
                str++;
                end--;
            }
        }

        System.out.println(count);
    }
}
