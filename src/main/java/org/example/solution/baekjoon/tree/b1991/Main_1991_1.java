package org.example.solution.baekjoon.tree.b1991;

/**
 * 트리 순회
 * 제한시간 2초
 * N = 노드 ( 1 <= N <= 26 )
 *
 * 객체를 사용한 풀이
 */

import java.io.*;
import java.util.*;

public class Main_1991_1 {

    static Node head = new Node('A', null, null);
    static StringBuilder A = new StringBuilder();
    static StringBuilder B = new StringBuilder();
    static StringBuilder C = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            insertNode(head, root, left, right);
        }

        preOder(head);
        inOrder(head);
        postOrder(head);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

    static class Node{
        char value;
        Node left;
        Node right;

        public Node(char value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    static void insertNode(Node temp, char root, char left, char right){

        if (temp.value == root) {
            temp.left = (left == '.' ? null : new Node(left,null,null));
            temp.right = (right == '.' ? null : new Node(right,null,null));
        }
        else {
            if(temp.left != null) insertNode(temp.left, root, left, right);
            if(temp.right != null) insertNode(temp.right, root, left, right);
        }
    }

    static void preOder(Node node) {
        if (node == null) return;
        A.append(node.value);
        preOder(node.left);
        preOder(node.right);
    }

    static void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        B.append(node.value);
        inOrder(node.right);
    }

    static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        C.append(node.value);
    }
}