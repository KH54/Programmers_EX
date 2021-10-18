package com.programmers.level1;

import java.util.Arrays;

public class ���� {

    public static void main(String[] args) {
        int[] d = { 2, 2, 3, 3 };
        int budget = 10;

        System.out.println(solution(d, budget));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];

            if (budget < 0)
                break;

            answer++;
        }

        return answer;
    }
}
