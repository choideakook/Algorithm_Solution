package org.example.solution.b11286;

/**
 * 절댓값 힙
 *
 * 제한 시간 : 1sc
 * 1 <= N <= 100,000
 * x : 연산에 대한 정보를 나타내는 정수
 * -2^31 < x < 2^31
 * x != 0 -> 배열에 x 추가
 * x == 0 -> 배열에 가장 작은 절대값 출력 / 삭제
 */

import java.util.*;

public class Main_11286 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> min = new ArrayList<>();
        List<Integer> plu = new ArrayList<>();
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int num = sc.nextInt();

            if (num < 0) min.add(num);
            else if (num > 0) plu.add(num);

            else {
                if (min.size() > 1) Collections.sort(min);
                if (plu.size() > 1) Collections.sort(plu);
                int index = min.size() - 1;

                if(plu.size() == 0 && min.size() == 0)
                    System.out.println(0);

                else if (plu.size() == 0 && min.size() != 0) {
                    System.out.println(min.get(index));
                    min.remove(index);
                }
                else if (plu.size() != 0 && min.size() == 0){
                    System.out.println(plu.get(0));
                    plu.remove(0);
                }

                else if (Math.abs(min.get(index)) <= plu.get(0)) {
                    System.out.println(min.get(index));
                    min.remove(index);
                }
                else if(Math.abs(min.get(index)) > plu.get(0)){
                    System.out.println(plu.get(0));
                    plu.remove(0);
                }
            }
        }
    }
}
