package com.programmers.leve2;

public class 숫자의표현 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 1;
        
        for(int i = 1; i < n/2+1 ; i++) {
            int sum = 0;
            int plus = i;
            
            while(sum<n) {
                sum+=plus++;
            }
            if(sum==n) {
                answer++;
            }
        }
        
        return answer;
    }
}
