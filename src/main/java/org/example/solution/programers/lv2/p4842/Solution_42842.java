package org.example.solution.programers.lv2.p4842;

/**
 * brown = border ( 8 ~ 5,000 )
 * yellow = inside ( 1 ~ 2,000,000 )
 * x >= y
 */
public class Solution_42842 {
    public int[] solution(int brown, int yellow) {
        if (yellow > 1)
            return calculator(brown, yellow);
        else
            return new int[] {3, 3};
    }
    int[] calculator(int brown, int yellow) {
        for (int Y = 1; Y < yellow; Y++) {
            if (yellow % Y == 0) {
                int X = yellow / Y;

                if (brown == addBrown(X, Y))
                    return new int[]{X + 2, Y + 2};
            }
        }
        return null;
    }
    int addBrown(int X, int Y) {
        return (2 * X) + (2 * Y) + 4;
    }
}
