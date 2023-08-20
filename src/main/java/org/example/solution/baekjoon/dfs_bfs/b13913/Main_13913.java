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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int max = 100000;

        boolean[] visited = new boolean[max + 1];

        Queue<Move> Q = new LinkedList<>();

        visited[N] = Q.add(new Move(N, 0, new StringBuilder()));

        while (!Q.isEmpty()) {
            Move now = Q.poll();

            if (now.gN() == K){
                System.out.println(now.gC());
                System.out.println(now.gS());
                break;
            }

            if (now.gN() < max && !visited[now.gN() + 1] && now.gN() < K)
                visited[now.gN() + 1] = Q.add(new Move(
                        now.gN() + 1, now.gC() + 1, now.gS()
                ));
            if (now.gN() - 1 >= 0 && !visited[now.gN() - 1])
                visited[now.gN() - 1] = Q.add(new Move(
                        now.gN() - 1, now.gC() + 1, now.gS()
                ));
            if (now.gN() * 2 < visited.length && !visited[now.gN() * 2] && now.gN() < K)
                visited[now.gN() * 2] = Q.add(new Move(
                        now.gN() * 2, now.gC() + 1, now.gS()
                ));
        }
    }
    static class Move{
        private int now, count;
        private StringBuilder sb = new StringBuilder();

        public int gN() {
            return this.now;
        }
        public int gC() {
            return this.count;
        }
        public StringBuilder gS() {
            return this.sb;
        }

        public Move(int now, int count, StringBuilder sb) {
            this.now = now;
            this.count = count;
            this.sb.append(sb).append(now + " ");
        }
    }
}