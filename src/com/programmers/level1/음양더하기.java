package com.programmers.level1;

public class 음양더하기 {
    public static void main(String[] args) {
        int[] absolutes = { 4, 7, 12 };
        boolean[] signs = { true, false, true };

        System.out.println(solution(absolutes, signs));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            absolutes[i] = signs[i] == true ? absolutes[i] : -absolutes[i];
        }
        
        for(int index : absolutes) {
            answer += index;
        }

        return answer;
    }
}
