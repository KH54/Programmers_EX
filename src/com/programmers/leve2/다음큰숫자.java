package com.programmers.leve2;

public class ����ū���� {
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
