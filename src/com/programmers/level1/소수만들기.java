package com.programmers.level1;

import java.util.Arrays;

public class 소수만들기 {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 7, 6, 4 };

        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                     int sum = nums[i] + nums[j] + nums[k];
                     answer += make_prime(sum);
                }
            }
        }
        return answer;
    }

    public static int make_prime(int number) {
        if (number < 2) {
            return 0;
        }

        if (number == 2) {
            return 1;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
