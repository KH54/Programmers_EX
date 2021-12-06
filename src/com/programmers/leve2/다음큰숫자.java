package com.programmers.leve2;

public class 다음큰숫자 {
    public static void main(String[] args) {
        int n = 78;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int next = n;

        while (true) {
            next++;
            if (Integer.bitCount(n) == Integer.bitCount(next)) {
                return next;
            }
        }
    }
}
