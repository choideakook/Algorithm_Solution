package org.example.solution.programers.lv2.p49994;

/**
 * 방문 길이
 * dirs ( 1 ~ 500 )
 */
public class Solution_49994 {
    String[][] visited = new String[11][11];
    int count;
    public int solution(String dirs) {
        int[] now = {5, 5};
        String[] order = dirs.split("");
        for (int i = 0; i < order.length; i++)
            now = move(now, order[i]);
        return count;
    }
    int[] move(int[] now, String move) {
        int Y = now[0];
        int X = now[1];
        String back = "";
        switch (move) {
            case "U" -> {Y += 1; back = "D";}
            case "D" -> {Y -= 1; back = "U";}
            case "R" -> {X += 1; back = "L";}
            default -> {X -= 1; back = "R";}
        }
        if (visited[now[0]][now[1]] == null) visited[now[0]][now[1]] = "";
        if (visited[now[0]][now[1]].indexOf(move) != -1)
            return new int[]{Y, X};

        else if (
                Y >= 0 && X >= 0 &&
                Y < 11 && X < 11
        ) {
            count++;
            visited[now[0]][now[1]] += move;
            if (visited[Y][X] == null) visited[Y][X] = "";
            visited[Y][X] += back;
            return new int[]{Y, X};
        }
        else return now;
    }
}