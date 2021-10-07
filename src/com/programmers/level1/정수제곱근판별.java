package com.programmers.level1;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        long n = 121;
        
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        long answer = 0;
        
        answer = (long) Math.sqrt(n);
        if(answer * answer == n) {
            return (long) Math.pow((answer+1),2);
        } else {
            return -1;
        }
        
    }
}
