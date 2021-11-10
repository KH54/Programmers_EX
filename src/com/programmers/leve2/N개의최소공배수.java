package com.programmers.leve2;

public class N개의최소공배수 {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 14 };
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int result = gcd(answer, arr[i]);
            answer = answer * arr[i] / result;
        }
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
