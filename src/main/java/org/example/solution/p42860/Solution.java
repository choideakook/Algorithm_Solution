package org.example.solution.p42860;

public class Solution {


    public int solution(String name) {
        int moveCost = moveCost(name);
        int nameCost = nameCost(name);
        return moveCost + nameCost;
    }

    private int nameCost(String name) {
        int nameCost = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            int diff = Math.max(c - 'A', 'Z' - c + 1);

            nameCost += diff;
        }
        return nameCost;
    }

    private int moveCost(String name) {
        int moveCost = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

            int diff = c - 'A';

            if (diff > 0)
                moveCost = i;
        }
        return moveCost;
    }

}
