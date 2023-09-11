package org.example.solution.programers.lv2.p92341;

/**
 * 주차 요금 계산
 * fees = 주차 요금
 * [0] = 기본 시간 ( 1 ~ 1,439 분 )
 * [1] = 기본 요금 ( 0 ~ 100,000 원 )
 * [2] = 단위 시간 (1 ~ 1,439 분 )
 * [3] = 단위 요금 ( 1 ~ 10,000 원 )
 *
 * records = 입출차 내역 ( 1 ~ 1,000 / "시각 번호 내역")
 */

import java.util.*;

public class Solution_92341 {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Record> repo = new HashMap<>();
        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < records.length; i++) {
            String[] split = records[i].split(" ");

            if (split[2].equals("IN") && !repo.containsKey(split[1])) {
                Record reco = new Record();
                repo.put(split[1], reco.checkIn(split[0]));
                set.add(split[1]);
            } else if (split[2].equals("IN") && repo.containsKey(split[1])) {
                Record reco = repo.get(split[1]);
                reco.checkIn(split[0]);
            } else {
                Record reco = repo.get(split[1]);
                reco.checkOut(split[0]);
            }
        }
        for (Record reco : repo.values()) {
            if (reco.isIn) reco.checkOut("23:59");
            reco.calFee(fees);
        }

        int i = 0;
        int[] answer = new int[set.size()];
        for (String s : set) {
            answer[i] = repo.get(s).fee;
            i++;
        }
        return answer;
    }
}

class Record {
    double using;
    int in;
    int fee;
    boolean isIn;
    Record checkIn(String in) {
        this.in = casting(in);
        this.isIn = true;
        return this;
    }
    void checkOut(String time) {
        int out = casting(time);
        using += out - in;
        this.isIn = false;
    }
    void calFee(int[] fees) {
        int ceil = (int) Math.ceil((this.using - fees[0]) / fees[2]);
        this.fee = ceil > 0 ? fees[1] + (ceil * fees[3]) : fees[1];
    }

    int casting(String time) {
        String[] split = time.split(":");
        int t = 0;

        t += Integer.parseInt(split[0]) * 60;
        t += Integer.parseInt(split[1]);
        return t;
    }
}
