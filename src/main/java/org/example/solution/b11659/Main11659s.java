package org.example.solution.b11659;

import java.util.*;
import java.io.*;

public class Main11659s {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(tk.nextToken()) + 1;
        int tern = Integer.parseInt(tk.nextToken());

        int[] S = new int[length];

        tk = new StringTokenizer(br.readLine());
        for(int i = 1; i < length; i++)
            S[i] = S[i -1] + Integer.parseInt(tk.nextToken());

        for (int i = 0; i < tern; i++) {
            tk = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(tk.nextToken()) - 1;
            int last = Integer.parseInt(tk.nextToken());

            System.out.println(S[last] - S[first]);
        }
    }
}
