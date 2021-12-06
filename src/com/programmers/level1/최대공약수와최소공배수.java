package com.programmers.level1;

import java.util.Arrays;

public class 최대공약수와최소공배수 {
    public static void main(String args[]) {
        int n = 2;
        int m = 5;

        System.out.println(Arrays.toString(solution(n, m)));

    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
