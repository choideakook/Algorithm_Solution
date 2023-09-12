package org.example.solution.programers.lv2.p17686;

/**
 * [3차] 파일명 정렬
 * files ( 1 ~ 1,000 )
 * index ( 1 ~ 100 )
 */

import java.util.*;

public class Solution_17686 {
    public String[] solution(String[] files) {
        PriorityQueue<File> Q = new PriorityQueue<>((a, b) -> {
            if (a.head.equals(b.head))
                return a.num - b.num;
            return a.head.compareTo(b.head);
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
    String head, file;
    int num;

    public File(String file) {
        String[] split = this.split(file);
        this.file = file;
        this.head = split[0].toLowerCase();
        this.num = Integer.parseInt(split[1]);
    }

    String[] split(String file) {
        String[] split = new String[2];
        int num = 0;

        for (int i = 0; i < file.length(); i++) {
            char cha = file.charAt(i);
            if (split[0] == null && cha >= '0' && cha <= '9') {
                split[0] = file.substring(0, i);
                num = i;
            }
            else if (split[0] != null && (cha < '0' || cha > '9')) {
                split[1] = file.substring(num, i);
                break;
            }
        }
        return split;
    }
}