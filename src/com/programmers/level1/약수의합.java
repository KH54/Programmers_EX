package com.programmers.level1;

public class 약수의합 {
    public static void main(String[] args) {
        int n = 12;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        
        for(int i = 0 ; i < n; i++) {
            if(n%i == 0) {
                answer+=i;
            }
        }
        
        return answer;
    }
}
