package org.example.solution.programers.lv2.p42577;

/**
 * 전화번호 목록
 * phone_book ( 1 ~ 1,000,000 )
 * index ( 1 ~ 20 )
 */
import java.util.*;

public class Solution_42577 {
    boolean answer = true;
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book, new Comparator<String>() {
           @Override
           public int compare(String a, String b) {
               int length = Math.min(a.length(), b.length());
               for (int i = 0; i < length; i++) {
                   char A = a.charAt(i);
                   char B = b.charAt(i);

                   if (A != B) return A - B;
               }
               answer = false;
               return a.length() - b.length();
           }
        });
        return answer;
    }
}
