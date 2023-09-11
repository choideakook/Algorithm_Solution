package org.example.solution.programers.lv2.p42888;

/**
 * 오픈 채팅방
 * record ( 1 ~ 100,000 ) / "action usr nick"
 * usr , nick ( 1 ~ 10 )
 */

import java.util.*;

public class Solution_42888 {
    public String[] solution(String[] record) {
        ArrayList<String[]> msg = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String[] split = record[i].split(" ");

            if (split[0].equals("Enter")) {
                msg.add(new String[]{split[1], "님이 들어왔습니다."});
                map.put(split[1], split[2]);
            }
            else if (split[0].equals("Leave")) {
                msg.add(new String[]{split[1], "님이 나갔습니다."});
            }
            else {
                map.put(split[1], split[2]);
            }
        }

        String[] answer = new String[msg.size()];
        for (int i = 0; i < msg.size(); i++)
            answer[i] = map.get(msg.get(i)[0]) + msg.get(i)[1];

        return answer;
    }
}