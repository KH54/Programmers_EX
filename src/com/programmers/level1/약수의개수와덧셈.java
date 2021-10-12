package com.programmers.level1;

public class ¾à¼öÀÇ°³¼ö¿Íµ¡¼À {

    public static void main(String[] args) {
        int left = 13;
        int right = 17;

        System.out.println(solution(left, right));
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            answer += cnt % 2 == 0 ? i : -i;
        }
        return answer;
    }
}
