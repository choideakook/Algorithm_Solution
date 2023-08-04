package org.example.solution.baekjoon.tree.b1991;

/**
 * 트리 순회
 * 제한시간 2초
 * N = 노드 ( 1 <= N <= 26 )
 */

import java.util.*;
import java.io.*;

public class Main_1991 {

    static Map<String, List<String>> map = new HashMap<>();
    static StringBuilder A = new StringBuilder();
    static StringBuilder B = new StringBuilder();
    static StringBuilder C = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            List<String> list = new ArrayList<>();

            String key = st.nextToken();
            list.add(st.nextToken());
            list.add(st.nextToken());

            map.put(key, list);
        }
        preorder("A", map.get("A").get(0), map.get("A").get(1));
        inorder("A", map.get("A").get(0), map.get("A").get(1));
        postorder("A", map.get("A").get(0), map.get("A").get(1));

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

    static void preorder(String key, String left, String right){
        A.append(key);

        if (!left.equals("."))
            preorder(left, map.get(left).get(0), map.get(left).get(1));

        if (!right.equals("."))
            preorder(right, map.get(right).get(0), map.get(right).get(1));
    }
    static void inorder(String key, String left, String right){
        if (!left.equals("."))
            inorder(left, map.get(left).get(0), map.get(left).get(1));

        B.append(key);

        if (!right.equals("."))
            inorder(right, map.get(right).get(0), map.get(right).get(1));
    }
    static void postorder(String key, String left, String right){
        if (!left.equals("."))
            postorder(left, map.get(left).get(0), map.get(left).get(1));

        if (!right.equals("."))
            postorder(right, map.get(right).get(0), map.get(right).get(1));

        C.append(key);
    }
}
