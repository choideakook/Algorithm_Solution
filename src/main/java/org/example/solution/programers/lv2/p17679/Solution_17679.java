package org.example.solution.programers.lv2.p17679;

/**
 * 프렌즈 4블록
 * board[][] ( 2 ~ 30 )
 * m = Y / n = X
 */

import java.util.*;

public class Solution_17679 {
    ArrayList<Character>[] maps;
    int[][] dij = {{1, 0}, {0, 1}, {1, 1}};
    int answer, Y, X;
    boolean[][] smash;

    public int solution(int m, int n, String[] board) {
        maps = new ArrayList[n];
        Y = m; X = n;

        for (int i = 0; i < n; i++) {
            maps[i] = new ArrayList<>();
            for (int j = m - 1; j >= 0; j--)
                maps[i].add(board[j].charAt(i));
        }

        int count = -1;
        while (answer != count) {
            count = answer;
            bockRemover();
        }
        return answer;
    }

    void bockRemover() {
        smash = new boolean[X][Y];
        for (int i = 0; i < X - 1; i++)
            for (int j = 0; j < Y - 1; j++)
                if (!smash[i][j]) DFS(i, j);
        for (int i = 0; i < maps.length; i++)
            for (int j = maps[i].size() - 1; j >= 0; j--)
                if (smash[i][j]) {
                    maps[i].remove(j);
                    answer++;
                }
    }

    void DFS(int i, int j) {
        if (isSmash(i, j)) {
            trueOn(i, j);
            for (int k = 0; k < 3; k++)
                DFS(i + dij[k][0], j + dij[k][1]);
        }
    }

    boolean isSmash(int i, int j) {
        if (
                i + 1 == maps.length ||
                j + 1 >= maps[i].size() ||
                j + 1 >= maps[i + 1].size()
        ) return false;

        return maps[i].get(j) == maps[i].get(j + 1) &&
                maps[i + 1].get(j) == maps[i + 1].get(j + 1) &&
                maps[i].get(j) == maps[i + 1].get(j);
    }

    void trueOn(int i, int j) {
        smash[i][j] = true;
        smash[i + 1][j] = true;
        smash[i][j + 1] = true;
        smash[i + 1][j + 1] = true;
    }
}
