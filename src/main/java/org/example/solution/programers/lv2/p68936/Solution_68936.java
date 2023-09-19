package org.example.solution.programers.lv2.p68936;

/**
 * 쿼드압축 후 개수 세기
 * arr[][] = 정사각형 ( 1 ~ 1,024 )
 */

public class Solution_68936 {
    int[][] map;

    public int[] solution(int[][] arr) {
        map = arr;
        return zip(new int[]{0,0}, new int[]{map.length, map.length});
    }

    int[] zip(int[] S, int[] E) {
        int[] result = new int[2];
        int num = map[S[0]][S[1]];

        for (int i = S[0]; i < E[0]; i++)
            for (int j = S[1]; j < E[1]; j++)
                if (num != map[i][j])
                    return divider(S, E);

        result[num]++;
        return result;
    }

    int[] divider(int[] S, int[] E) {
        int[] result = new int[2];
        int[] M = new int[2];
        M[0] = (S[0] + E[0]) / 2;
        M[1] = (S[1] + E[1]) / 2;

        int[] A = zip(new int[]{S[0], S[1]}, new int[]{M[0], M[1]});
        int[] B = zip(new int[]{S[0], M[1]}, new int[]{M[0], E[1]});
        int[] C = zip(new int[]{M[0], S[1]}, new int[]{E[0], M[1]});
        int[] D = zip(new int[]{M[0], M[1]}, new int[]{E[0], E[1]});

        result[0] = A[0] + B[0] + C[0] + D[0];
        result[1] = A[1] + B[1] + C[1] + D[1];
        return result;
    }
}
