package com.programmers.leve2;

public class 피보나치수 {
    public static void main(String[] args) {

        int n = 25;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        answer = fibo(n) % 1234567;

        return answer;
    }

    public static int fibo(int n) {

        if (n <= 1) {
            return n;
        }
        else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
