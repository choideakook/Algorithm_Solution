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

        int max = Math.max(N, K);
        int min = Math.min(N, K) - 10;

        boolean[] visited = new boolean[max + 3];
        visited[max + 2] = true;

        Queue<Move> Q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        visited[N] = Q.add(new Move(N, 0, list));

        while (!Q.isEmpty()) {
            Move now = Q.poll();

            if (now.gN() == K){
                System.out.println(now.gC());
                for(int i : now.list)
                    System.out.print(i + " ");
                break;
            }

            if (!visited[now.gN() + 1])
                visited[now.gN() + 1] = Q.add(new Move(
                        now.gN() + 1, now.gC() + 1, now.gL()
                ));
            if (now.gN() - 1 >= 0 && now.gN() -1 >= min && !visited[now.gN() - 1])
                visited[now.gN() - 1] = Q.add(new Move(
                        now.gN() - 1, now.gC() + 1, now.gL()
                ));
            if (now.gN() * 2 < visited.length && !visited[now.gN() * 2])
                visited[now.gN() * 2] = Q.add(new Move(
                        now.gN() * 2, now.gC() + 1, now.gL()
                ));
        }
    }
    static class Move{
        private int now, count;
        private List<Integer> list = new ArrayList<>();

        public int gN() {
            return this.now;
        }
        public int gC() {
            return this.count;
        }
        public List<Integer> gL() {
            return this.list;
        }

        public Move(int now, int count, List<Integer> list) {
            this.now = now;
            this.count = count;
            for (int i : list) this.list.add(i);
            this.list.add(now);
        }
    }
}
