package com.programmers.level1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        long n = 118372;

        System.out.println(solution(n));
    }

    public static long solution(long n) {
        long answer = 0;

        String num = String.valueOf(n);
        String sum = "";
        char[] arr = new char[num.length()];

        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i);
        }

        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            sum +=arr[i];
        }
        
        answer = Long.parseLong(sum);

        return answer;
    }
}
