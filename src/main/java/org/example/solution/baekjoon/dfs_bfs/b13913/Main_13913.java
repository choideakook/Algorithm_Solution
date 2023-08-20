package org.example.solution.baekjoon.dfs_bfs.b13913;

/**
 * 숨바꼭질 4
 * 시간 2초
 *
 * N = start ( 0 ~ 100,000 )
 * K = goal ( 0 ~ 100,000 )
 */

import java.util.*;

public class Main_13913 {
    static int[] visited = new int[100001];
    static int[] move = new int[100001];
    static int start, end;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();

        BFS(start);

        System.out.println(visited[end]);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(start + " ");

        int i = end;
        while (i != start) {
            stack.push(i);
            i = move[i];
        }

        while (!stack.isEmpty())
            sb.append(stack.pop() + " ");

        System.out.println(sb);
    }
    static void BFS(int start) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(start);

        while (!Q.isEmpty()) {
            int now = Q.poll();
            if (now == end) break;

            if (now - 1 >= 0 && visited[now - 1] == 0) {
                visited[now - 1] = visited[now] + 1;
                move[now - 1] = now;
                Q.add(now - 1);
            }

            if (now + 1 < move.length && visited[now + 1] == 0) {
                visited[now + 1] = visited[now] + 1;
                move[now + 1] = now;
                Q.add(now + 1);
            }

            if (now * 2 < move.length && visited[now * 2] == 0) {
                visited[now * 2] = visited[now] + 1;
                move[now * 2] = now;
                Q.add(now * 2);
            }
        }
    }
}