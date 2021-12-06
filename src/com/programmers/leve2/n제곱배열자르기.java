package com.programmers.leve2;

import java.util.Arrays;

public class n제곱배열자르기 {

    public static void main(String[] args) {
        int n = 3;
        int left = 2;
        int right = 5;

        System.out.println(Arrays.toString(solution(n, left, right)));
    }

    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right-left)+1];
        int count =0;
        
        for(long i = left; i <= right; i++) {
            answer[count++] = (int) (Math.max(i/n, i%n)+1);
        }

        return answer;
    }
}