package org.example.solution.b1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1940 {
    /**
     * 값옷을 만드는 재료 -> 고유한 번호가 있음
     * 갑옷은 2개의 재료로 고유 번호의 합이 M 이 되야 갑옷을 만들 수 있음
     * 1 =< M =< 10,000,000
     * 갖고있는 재료로 몇개의 갑옷을 만들 수 있는가?
     * 재료의 갯수 = N ( 1 =< N =< 15,000)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());
        int[] nums = new int[N + 1];

        for (int i = 1; i < N + 1; i++)
            nums[i] = Integer.parseInt(tk.nextToken());

        Arrays.sort(nums);

        int start = 1, end = N, answer = 0;

        while (start != end) {
            int sum = nums[start] + nums[end];

            if (sum < M) start++;
            else if (sum > M) end--;
            else {
                answer++;
                start++;
                end--;
            }

            if (start > end) break;
        }
        System.out.println(answer);
    }
}
