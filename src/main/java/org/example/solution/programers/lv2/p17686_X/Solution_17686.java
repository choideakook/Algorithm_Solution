package org.example.solution.programers.lv2.p17686_X;

/**
 * [3차] 파일명 정렬
 * files ( 1 ~ 1,000 )
 * index ( 1 ~ 100 )
 */

import java.util.*;

public class Solution_17686 {
    public String[] solution(String[] files) {
        PriorityQueue<File> Q = new PriorityQueue<>((a, b) -> {
            if (a.head.equals(b.head)) {
                if (a.num == b.num)
                    return 0;
                return a.num - b.num;
            }
            return (a.head).compareToIgnoreCase(b.head);
        });

        for (int i = 0; i < files.length; i++)
            Q.add(new File(files[i]));

        String[] answer = new String[files.length];
        for (int i = 0; i < files.length; i++)
            answer[i] = Q.poll().file;

        return answer;
    }
}

class File {
    String file, head;
    int num;

    File(String file) {
        String[] split = this.split(file);
        this.file = file;
        this.head = split[0].toLowerCase();
        this.num = Integer.parseInt(split[1]);
    }

    String[] split(String file) {
        String[] head = file.split("[0-9]");
        String[] num = file.split("[^0-9]");
        String[] result = new String[2];
        result[0] = head[0];
        for (String str : num)
            if (!str.equals("")) {
                result[1] = str;
                break;
            }
        return result;
    }
}