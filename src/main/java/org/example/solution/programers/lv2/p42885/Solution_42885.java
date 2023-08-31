package org.example.solution.programers.lv2.p42885;

import java.util.Arrays;

/**
 * people[] ( 1 ~ 50,000 )
 * people ( 40 kg ~ 240 kg )
 * <p>
 * limit = boat limit ( 40 kg ~ 240 kg )
 */
public class Solution_42885 {
    public int solution(int[] people, int limit){
        int max = people.length - 1;
        int min = 0;
        int answer = 0;
        
        Arrays.sort(people);
        
        while (min <= max) {
            answer++;
            if (min == max) break;

            int sum = people[min] + people[max];
            if (sum <= limit){
                max--;
                min++;
            } else max--;
        }
        return answer;
    }
}
