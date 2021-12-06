package com.programmers.level1;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        long n = 12345;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(long n) {
        
        String str = Long.toString(n);
        
        StringBuilder sb = new StringBuilder(str);
        
        sb.reverse();
        
        String[] s = sb.toString().split("");
        
        int[] answer = new int[s.length];
        
        for(int i = 0 ; i < s.length; i++) {
            answer[i] = Integer.parseInt(s[i]);
        }

        return answer;
        
    }
}
