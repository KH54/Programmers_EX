package com.programmers.level1;

public class 짝수와홀수 {
    public static void main(String[] args) {
        int num = 3;
        
        System.out.println(num);
    }

    public String solution(int num) {
        String answer = "";
        
        if( num % 2 == 0) {
            answer = "Even";
        } else
            answer = "Odd";
        
        return answer;
    }
}
