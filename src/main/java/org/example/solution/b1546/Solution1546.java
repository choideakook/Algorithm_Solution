package org.example.solution.b1546;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double points[] = new double[N];

        for (int i = 0; i < N; i++)
            points[i] = sc.nextInt();

        double sum = 0.0;
        double max = Math.floor(
                (Arrays.stream(points).max().getAsDouble()) * 100) / 100.0;

        for (double i : points) {
            double point = Math.floor((i * 100) / 100.0);
            sum += point / max * 100;
        }

        System.out.println(Math.floor((sum / N) * 100) / 100.0);
    }

    /**
     * N <= 1000
     * M * point / 100 = new point
     */
    public double solution(int N, double... points) {

        double sum = 0.0;
        double max = Math.floor(
                (Arrays.stream(points).max().getAsDouble()) * 100) / 100.0;

        for (double i : points) {
            double point = Math.floor((i * 100) / 100.0);
            sum += point / max * 100;
        }

        return Math.floor((sum / N) * 100) / 100.0;
    }
}
