package com.programmers.level1;

public class 문자열을정수로바꾸기 {
    public static void main(String[] args) {
        String s = "1234";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);
        
        return answer;
    }
}
