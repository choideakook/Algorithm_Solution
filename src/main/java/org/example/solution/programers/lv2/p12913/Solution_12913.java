package org.example.solution.programers.lv2.p12913;

/**
 * 땅따먹기
 * land[ 1 ~ 100,000 ][ 4 ]
 */

public class Solution_12913 {
    int[][] map;
    int[] max;
    int index;
    int solution(int[][] land) {
        map = land;
        maxSearch(0);
        adder(1);

        for (int y = 1; y < map.length - 1; y++) {
            maxSearch(y);
            adder(y + 1);
        }
        maxSearch(map.length - 1);
        return max[0];
    }
    void maxSearch(int y) {
        max = new int[2];
        for (int x = 0; x < 4; x++)
            if (map[y][x] > max[0]) {
                max[1] = max[0];
                max[0] = map[y][x];
                index = x;
            }
            else if (map[y][x] > max[1]) {
                max[1] = map[y][x];
            }
    }
    void adder(int y) {
        map[y][index] += max[1];
        for (int x = 0; x < 4; x++)
            if (x != index)
                map[y][x] += max[0];
    }
}