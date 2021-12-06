package com.programmers.level1;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {

    public static void main(String[] args) {
        int[] lottos = { 0, 0, 0, 0, 0, 0 };
        int[] win_nums = { 31, 10, 45, 1, 6, 19 };

        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int count = 0;
        int zeroCount = 0;

        for (int i : lottos) {
            for (int j : win_nums) {
                if (i == 0) {
                    zeroCount++;
                    break;
                } else if (i == j) {
                    count++;
                    break;
                }
            }
        }
        int[] result = { count + zeroCount, count };

        for (int i = 0; i < result.length; i++) {
            switch (result[i]) {
            case 0:
                answer[i] = 6;
                break;
            case 1:
                answer[i] = 6;
                break;
            case 2:
                answer[i] = 5;
                break;
            case 3:
                answer[i] = 4;
                break;
            case 4:
                answer[i] = 3;
                break;
            case 5:
                answer[i] = 2;
                break;
            case 6:
                answer[i] = 1;
                break;
            }
        }

        return answer;
    }
}
