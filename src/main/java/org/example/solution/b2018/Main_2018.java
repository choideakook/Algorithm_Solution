package org.example.solution.b2018;

import java.util.*;

public class Main_2018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int str = 0, last = 0, count = 0;
        long N = 0;

        while (str + last <= num * 2) {

            if (N < num) {
                last++;
                N += last;
            }
            else if (N > num) {
                N -= str;
                str++;
            }
            else {
                count++;
                last++;
                N += last;
            }
        }

        System.out.println(count);
    }
}
